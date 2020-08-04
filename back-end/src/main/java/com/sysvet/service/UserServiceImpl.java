package com.sysvet.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sysvet.dto.MessageDTO;
import com.sysvet.dto.PaginationResponse;
import com.sysvet.model.Usuario;
import com.sysvet.repository.UsuarioRepository;


@Service
@Transactional
public class UserServiceImpl extends GenericService<Usuario, Long> implements UserService {
	
	private UsuarioRepository usuarioRepository;
	
    public UserServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

	@Override
	public JpaRepository<Usuario, Long> getRepository() {
		return this.usuarioRepository;
	}

	@Override
	public PaginationResponse<Usuario> findByFilter(String filter, int page, int size) {
		Page<Usuario> searchResult;
		PageRequest pageRequest = PageRequest.of(page, size);
		
		if (filter == null || filter.isEmpty()) {
			searchResult = usuarioRepository.findAll(pageRequest);
		} else {
			searchResult = usuarioRepository.findAllByNameContainsOrLastnameContains(filter, pageRequest);
		}
		
		PaginationResponse<Usuario> response = new PaginationResponse<>();
		response.setContent(searchResult.getContent());
		response.setTotalCount(searchResult.getTotalElements());
		return response;
	}
	
	@Override
	public Usuario editUser(Long id, Usuario usuario) {
		Usuario usuarioLogueado = this.getOne(id);
		usuarioLogueado.setNombre(usuario.getNombre());
		usuarioLogueado.setApellido(usuario.getApellido());
		usuarioLogueado.setEmail(usuario.getEmail());
		usuarioLogueado.setRol(usuario.getRol());
		usuarioLogueado.setActive(usuario.isActive());
		return this.update(id, usuarioLogueado);
	}

	@Override
	public MessageDTO editUserPassword(Long id, String password) {
		Usuario usuario = this.getOne(id);
		usuario.setContrasenha(password);
		this.update(id, usuario);
		return new MessageDTO("exitoso");
	}

}

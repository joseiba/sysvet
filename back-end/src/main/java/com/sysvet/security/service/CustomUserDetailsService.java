package com.sysvet.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sysvet.model.Usuario;
import com.sysvet.repository.UsuarioRepository;
import com.sysvet.security.UserPrincipal;


@Service
@Transactional
public class CustomUserDetailsService implements UserDetailsService {
	
	private final UsuarioRepository usuarioRepository;

    @Autowired
    public CustomUserDetailsService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		Usuario usuario = usuarioRepository.findByEmail(email).orElseThrow(
                () -> new UsernameNotFoundException("Usuario no encontrado : " + email)
        );

        return UserPrincipal.create(usuario);
	
	}

}

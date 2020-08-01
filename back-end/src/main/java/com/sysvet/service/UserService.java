package com.sysvet.service;

import com.sysvet.dto.MessageDTO;
import com.sysvet.dto.PaginationResponse;
import com.sysvet.model.Usuario;

public interface UserService extends IGenericService<Usuario, Long> {
	
	/**
	 * Busca los registros para el filto
	 * 
	 * @param filter
	 * @param page
	 * @param size
	 * @return 
	 */
	
	PaginationResponse<Usuario> findByFilter(String filter, int page, int size);
	
	/**
	 * Editar un usuario, ignorando el password
	 * 
	 * @param id
	 * @param usuario
	 * @return 
	 */
	
	Usuario editUser(Long id, Usuario usuario);
	
	MessageDTO editUserPassword(Long id, String password);

}

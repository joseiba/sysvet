package com.sysvet.repository;

import com.sysvet.model.Usuario;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	/**
	 * Se busca usuario por email
	 * 
	 * @param email 
	 * @return {@link Usuario}
	 */
	
	Optional<Usuario> findByEmail(String email);
	
	/**
	 * Buscar usuario por nombre, apellido o email
	 * 
	 * @param nombre
	 * @param apellido
	 * @param email
	 * @param pegeable
	 * @return {@link Page <usuario>}
	 * 
	 */
	
	//Page<Usuario> findAllByNameContainsOrLastnameContainsOrEmailContains(String nombre, String apellido,
    //        															String email, Pageable pageable);
	
	
	/**
	 * Obtiene la lista por los siguientes criterios
	 * 
	 * @return {@link Page <Usuario>}
	 */
	
	@Query("select p from Usuario p where concat(nombre,' ',apellido) like %:filtro% or email like %:filtro% or rol like %:filtro%")
    Page<Usuario> findAllByNameContainsOrLastnameContains(@Param("filtro") String nombre, Pageable pageable);

}

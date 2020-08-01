package com.sysvet.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public interface IGenericService <T, K extends Serializable>{
	
	/**
	 * Obtener Repositorio del servicio
	 * @return {@link JpaRepository}
	 * 
	 */
	JpaRepository<T, K> getRepository();
	
    /**
     * Obtener todos los objetos de una clase entidad
     *
     * @return {@link T}
     */
    List<T> getAll();
	
	/**
	 * Obtener todos los objetos de una clase entidad con
	 * paginacion
	 * 
	 * @param page
	 * @param size
	 * @return {@List<T>}
	 */
    List<T> getAllPagination(int page, int size);
    
    /**
     * Crear una nueva entidad o objeto
     * 
     * @param entity
     * @return {@link T}
     */
    T add(T entity);
    

    /**
     * Actualizar una entidad
     *
     * @param id
     * @param entity
     * @return {@link T}
     */
    T update(K id, T entity);
    
    /**
     * Obtener una instancia de una entidad por el id
     *
     * @param id
     * @return {@link T}
     */
    T getOne(K id);

    /**
     * Borrar una instancia sin datos relacionados
     *
     * @param id identificador
     */
    void delete(K id);
	
}

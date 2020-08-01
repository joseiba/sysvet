package com.sysvet.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sysvet.dto.MessageDTO;
import com.sysvet.dto.PaginationResponse;
import com.sysvet.model.Usuario;
import com.sysvet.service.UserService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/usuario")
public class UserController {
	
	private UserService userService;
	
	public UserController(UserService userService) {
		
		this.userService = userService;
	}	
	
	@ApiOperation(value = "Trae datos de Usuarios", notes = "Trae datos de un usuario en particular")
	@GetMapping("/{id}")
	public Usuario getUsuario(@PathVariable Long id) {
		return userService.getOne(id);
	}
	
	@ApiOperation(value = "Trae lista de Usuarios", notes = "Lista de usuarios que filtrando con un texto y retorna un paginado")
	@GetMapping("/")
	private PaginationResponse<Usuario> getAllUsers(@RequestParam(value = "filter", required = false) String filter, 
													@RequestParam(value = "page") int page,
													@RequestParam(value = "size") int size) {
		return userService.findByFilter(filter, page, size);
	}
	
	@ApiOperation(value = "Crear un usuario", notes = "Se crea un nuevo usuario")
	@PostMapping("/")
	private Usuario saveUser(@Valid @RequestBody Usuario usuario) {
		return userService.add(usuario);
	}
	
	@ApiOperation(value = "Edita un usuario", notes = "Se edita un usuario existente sin cambiar el password")
	@PutMapping("/{id}")
	private Usuario updateUser(@Valid @RequestBody Long id, Usuario usuario) {
		return userService.editUser(id, usuario);
	}
	
	@ApiOperation(value = "Cambiar Password", notes = "Cambia el password de un usuario")
    @PutMapping("/{id}/change-password")
    public ResponseEntity updatePassword(@Valid @RequestBody String password, @PathVariable Long id) {
        try{
            return ResponseEntity.status(HttpStatus.OK).body(userService.editUserPassword(id, password));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.OK).body(new MessageDTO("error"));
        }
    }
	

}

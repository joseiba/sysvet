package com.sysvet.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.sysvet.model.Usuario;

public class UserPrincipal implements UserDetails {
	
	private Long idUsuario;
	
	private String username;
	
	private String nombre;
	
	private String password;
	
	private String email;
	
	private final Collection<? extends GrantedAuthority> authorities;
	
	private boolean enabled;
	

	public UserPrincipal(Long idUsuario, String username, String nombre, String password, String email,
						Collection<? extends GrantedAuthority> authorities,boolean enabled) {
		this.idUsuario = idUsuario;
		this.username = username;
		this.nombre = nombre;
		this.password = password;
		this.authorities = authorities;
		this.email = email;
		this.enabled = enabled;
	}
	
	
	public static UserPrincipal create(Usuario usuario) {
		
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(usuario.getRol()));
		return new UserPrincipal(
					usuario.getId(), 
					usuario.getApellido(), 
					usuario.getEmail(),
					usuario.getContrasenha(),
					usuario.getEmail(),
					authorities, 
					usuario.isActive()
					);
		
	}	
	
	
	
	public Long getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEmail() {
		return email;
	}
	
	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		
		return username;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return enabled;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPrincipal that = (UserPrincipal) o;
        return Objects.equals(idUsuario, that.idUsuario);
    }
    
    @Override
    public int hashCode() {

        return Objects.hash(idUsuario);
    }
	
}

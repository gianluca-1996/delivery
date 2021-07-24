package com.app.delivery.models;

public class UserModel {

	private int id;
	private String usuario;
	private String contraseña;
	private UserRoleModel rol;
	private boolean enabled;
	
	public UserModel() {
		super();
	}

	public UserModel(int id, String usuario, String contraseña, UserRoleModel rol, boolean enabled) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.rol = rol;
		this.enabled = enabled;
	}

	public UserModel(String usuario, String contraseña, UserRoleModel rol, boolean enabled) {
		super();
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.rol = rol;
		this.enabled = enabled;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public UserRoleModel getRol() {
		return rol;
	}

	public void setRol(UserRoleModel rol) {
		this.rol = rol;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", usuario=" + usuario + ", contraseña=" + contraseña 
				+ ", enabled=" + enabled + "]";
	}
	
	
}

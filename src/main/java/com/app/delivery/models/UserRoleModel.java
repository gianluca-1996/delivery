package com.app.delivery.models;

public class UserRoleModel {

	private int id;
	private String rol;
	
	public UserRoleModel() {
		super();
	}

	public UserRoleModel(int id, String rol) {
		super();
		this.id = id;
		this.rol = rol;
	}

	public UserRoleModel(String rol) {
		super();
		this.rol = rol;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "UserRole [id=" + id + ", rol=" + rol + "]";
	}
	
}

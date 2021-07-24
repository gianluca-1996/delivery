package com.app.delivery.models;

public class EstadoModel {

	private int id;
	private String nombre;
	
	public EstadoModel() {
		super();
	}

	public EstadoModel(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public EstadoModel(String nombre) {
		super();
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "EstadoModel [id=" + id + ", nombre=" + nombre + "]";
	}
	
}

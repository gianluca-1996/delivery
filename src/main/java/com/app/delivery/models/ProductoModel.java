package com.app.delivery.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProductoModel {

	private int id;
	@NotNull(message = "El nombre debe ser incluido")
	private String nombre;
	@NotNull(message = "La descripción debe ser incluida")
	@Size(min=5, max=70)
	private String descripcion;
	@NotNull(message = "El precio debe ser incluido")
	private int precio;
	@NotNull(message = "Se debe incluir la disponibilidad")
	private boolean disponible;
	
	public ProductoModel() {
		super();
	}

	public ProductoModel(int id, String nombre, String descripcion, int precio, boolean disponible) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.disponible = disponible;
	}

	public ProductoModel(String nombre, String descripcion, int precio, boolean disponible) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.disponible = disponible;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", disponible=" + disponible + "]";
	}
	
	
}

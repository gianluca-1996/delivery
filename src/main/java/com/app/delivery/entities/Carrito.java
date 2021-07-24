package com.app.delivery.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carrito")
public class Carrito {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="cerrado")
	private boolean cerrado;
	
	@Column(name="total")
	private int total;

	public Carrito() {
		super();
	}

	public Carrito(int id, boolean cerrado, int total) {
		super();
		this.id = id;
		this.cerrado = cerrado;
		this.total = total;
	}
	public Carrito(boolean cerrado, int total) {
		super();
		this.cerrado = cerrado;
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isCerrado() {
		return cerrado;
	}

	public void setCerrado(boolean cerrado) {
		this.cerrado = cerrado;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}















package com.app.delivery.models;

public class CarritoModel {

	private int id;
	private boolean cerrado;
	private int total;
	
	public CarritoModel() {
		super();
	}

	public CarritoModel(int id, boolean cerrado, int total) {
		super();
		this.id = id;
		this.cerrado = cerrado;
		this.total = total;
	}

	public CarritoModel(boolean cerrado, int total) {
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

	@Override
	public String toString() {
		return "CarritoModel [cerrado=" + cerrado + ", total=" + total + "]";
	}
	
}

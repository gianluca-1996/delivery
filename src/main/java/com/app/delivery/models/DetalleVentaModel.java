package com.app.delivery.models;

public class DetalleVentaModel {

	private int id;
	private ProductoModel producto;
	private int cantidad;
	private int subTotal;
	
	public DetalleVentaModel() {
		super();
	}

	public DetalleVentaModel(int id, ProductoModel producto, int cantidad, int subTotal) {
		super();
		this.id = id;
		this.producto = producto;
		this.cantidad = cantidad;
		this.subTotal = subTotal;
	}

	public DetalleVentaModel(ProductoModel producto, int cantidad, int subTotal) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.subTotal = subTotal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ProductoModel getProducto() {
		return producto;
	}

	public void setProducto(ProductoModel producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(int subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "DetalleVenta [id=" + id + ", producto=" + producto + ", cantidad=" + cantidad + ", subTotal=" + subTotal
				+ "]";
	}
	
	
}

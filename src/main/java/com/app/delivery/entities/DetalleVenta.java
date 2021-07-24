package com.app.delivery.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detalleVenta")
public class DetalleVenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@JoinColumn(name="fk_producto")
	@ManyToOne
	private Producto producto;
	
	@JoinColumn(name="fk_carrito")
	@ManyToOne
	private Carrito carrito;
	
	@Column(name="cantidad")
	private int cantidad;
	
	@Column(name="subtotal")
	private int subTotal;

	public DetalleVenta() {
		super();
	}

	public DetalleVenta(int id, Producto producto, Carrito carrito, int cantidad, int subTotal) {
		super();
		this.id = id;
		this.producto = producto;
		this.carrito = carrito;
		this.cantidad = cantidad;
		this.subTotal = subTotal;
	}

	public DetalleVenta(Producto producto, Carrito carrito, int cantidad, int subTotal) {
		super();
		this.producto = producto;
		this.carrito = carrito;
		this.cantidad = cantidad;
		this.subTotal = subTotal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Carrito getCarrito() {
		return carrito;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
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
	
	
}

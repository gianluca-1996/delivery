package com.app.delivery.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class PedidoModel {

	private int id;
	private String nombreCliente;
	private String destino;
	private String celular;
	private int abona;
	private int vuelto;
	private EstadoModel estado;
	private CarritoModel carrito;
	private LocalDate fecha;
	private LocalTime hora;
	private UserModel usuario;
	
	public PedidoModel() {
		super();
	}
	
	public PedidoModel(int id, String nombreCliente, String destino, String celular, int abona, int vuelto,
			EstadoModel estado, CarritoModel carrito, LocalDate fecha, LocalTime hora, UserModel usuario) {
		super();
		this.id = id;
		this.nombreCliente = nombreCliente;
		this.destino = destino;
		this.celular = celular;
		this.abona = abona;
		this.vuelto = vuelto;
		this.estado = estado;
		this.carrito = carrito;
		this.fecha = fecha;
		this.hora = hora;
		this.usuario = usuario;
	}

	public PedidoModel(String nombreCliente, String destino, String celular, int abona, int vuelto, EstadoModel estado,
			CarritoModel carrito, LocalDate fecha, LocalTime hora, UserModel usuario) {
		super();
		this.nombreCliente = nombreCliente;
		this.destino = destino;
		this.celular = celular;
		this.abona = abona;
		this.vuelto = vuelto;
		this.estado = estado;
		this.carrito = carrito;
		this.fecha = fecha;
		this.hora = hora;
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public int getAbona() {
		return abona;
	}

	public void setAbona(int abona) {
		this.abona = abona;
	}

	public int getVuelto() {
		return vuelto;
	}

	public void setVuelto(int vuelto) {
		this.vuelto = vuelto;
	}

	public EstadoModel getEstado() {
		return estado;
	}

	public void setEstado(EstadoModel estado) {
		this.estado = estado;
	}

	public CarritoModel getCarrito() {
		return carrito;
	}

	public void setCarrito(CarritoModel carrito) {
		this.carrito = carrito;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public UserModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UserModel usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "PedidoModel [nombreCliente=" + nombreCliente + ", destino=" + destino + ", celular=" + celular
				+ ", abona=" + abona + ", vuelto=" + vuelto + ", estado=" + estado + ", carrito=" + carrito + ", fecha="
				+ fecha + ", hora=" + hora + "]";
	}

	
	
	
}

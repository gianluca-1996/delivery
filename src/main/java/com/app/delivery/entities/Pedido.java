package com.app.delivery.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nombreCliente")
	private String nombreCliente;
	
	@Column(name="destino")
	private String destino;
	
	@Column(name="celular")
	private String celular;
	
	@Column(name="abona")
	private int abona;
	
	@Column(name="vuelto")
	private int vuelto;
	
	@JoinColumn(name="fk_estado")
	@ManyToOne(optional=false, fetch=FetchType.EAGER)
	private Estado estado;
	
	@JoinColumn(name="fk_carrito")
	@OneToOne
	private Carrito carrito;
	
	@Column(name="fecha")
	@CreationTimestamp
	private LocalDate fecha;
	
	@Column(name="hora")
	@CreationTimestamp
	private LocalTime hora;
	
	@JoinColumn(name="fk_usuario")
	@ManyToOne
	private User usuario;

	public Pedido() {
		super();
	}

	public Pedido(int id, String nombreCliente, String destino, String celular, int abona, int vuelto,
			Estado estado, Carrito carrito, LocalDate fecha, LocalTime hora, User usuario) {
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

	public Pedido(String nombreCliente, String destino, String celular, int abona, int vuelto, Estado estado,
			Carrito carrito, LocalDate fecha, LocalTime hora, User usuario) {
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

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Carrito getCarrito() {
		return carrito;
	}

	public void setCarrito(Carrito carrito) {
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

	public User getUsuario() {
		return usuario;
	}

	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}
	
	
}












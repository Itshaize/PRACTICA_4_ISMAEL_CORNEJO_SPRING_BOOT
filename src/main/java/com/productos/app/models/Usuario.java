package com.productos.app.models;

import java.sql.PreparedStatement;

public class Usuario {
	/*CONSTRUCTOR*/
	private int id;
	private String nombre;
	private String cedula;
	private String correo;
	private String clave;
	private int estadoCivil;
	private int perfil;
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
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public int getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(int estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public int getPerfil() {
		return perfil;
	}
	public void setPerfil(int perfil) {
		this.perfil = perfil;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public Usuario(int id, String nombre, String cedula, String correo, String clave, int estadoCivil, int perfil) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cedula = cedula;
		this.correo = correo;
		this.clave = clave;
		this.estadoCivil = estadoCivil;
		this.perfil = perfil;
	}
}
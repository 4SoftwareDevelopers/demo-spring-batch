package com.example.demospringbatch.model;

public class Persona {

	private String primerNombre;
	private String segundoNombre;
	private String telefono;

	public Persona() {
		super();
	}

	public Persona(String primerNombre, String segundoNombre, String telefono) {
		super();
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.telefono = telefono;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", telefono=" + telefono
				+ "]";
	}
	
	

}

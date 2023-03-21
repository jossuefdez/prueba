package com.apps.model;

public class Consultorio {

	private String numeroDeConsultorio;
	private String piso;

	public Consultorio(String numeroDeConsultorio, String piso) {
		this.numeroDeConsultorio = numeroDeConsultorio;
		this.piso = piso;
	}

	public String getNumeroDeConsultorio() {
		return numeroDeConsultorio;
	}

	public void setNumeroDeConsultorio(String numeroDeConsultorio) {
		this.numeroDeConsultorio = numeroDeConsultorio;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	@Override
	public String toString() {
		return "Consultorio [numeroDeConsultorio=" + numeroDeConsultorio + ", piso=" + piso + "]";
	}

}

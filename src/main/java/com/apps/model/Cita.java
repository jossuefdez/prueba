package com.apps.model;

public class Cita {

	private Consultorio consultorio;
	private Doctor doctor;
	private String horarioDeConsulta;
	private String nombreDelPaciente;

	public Cita(Consultorio consultorio, Doctor doctor, String horarioDeConsulta, String nombreDelPaciente) {
		this.consultorio = consultorio;
		this.doctor = doctor;
		this.horarioDeConsulta = horarioDeConsulta;
		this.nombreDelPaciente = nombreDelPaciente;
	}

	public Consultorio getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(Consultorio consultorio) {
		this.consultorio = consultorio;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getHorarioDeConsulta() {
		return horarioDeConsulta;
	}

	public void setHorarioDeConsulta(String horarioDeConsulta) {
		this.horarioDeConsulta = horarioDeConsulta;
	}

	public String getNombreDelPaciente() {
		return nombreDelPaciente;
	}

	public void setNombreDelPaciente(String nombreDelPaciente) {
		this.nombreDelPaciente = nombreDelPaciente;
	}

	@Override
	public String toString() {
		return "Cita [consultorio=" + consultorio + ", doctor=" + doctor + ", horarioDeConsulta=" + horarioDeConsulta
				+ ", nombreDelPaciente=" + nombreDelPaciente + "]";
	}

}

package com.apps.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.apps.model.Consultorio;
import com.apps.model.Doctor;
import com.github.javafaker.Faker;

@Component
public class Util {

	public static List<Doctor> getDoctors(int numeroDeDoctores) {
		List<Doctor> resultado = new ArrayList<Doctor>();
		Faker doctor = new Faker();
		
		for(int i = 0; i < numeroDeDoctores; i++) {
			resultado.add(
					new Doctor(doctor.name().firstName(), 
							doctor.name().lastName(), 
							doctor.name().nameWithMiddle(), 
							doctor.medical().symptoms()));
		}
		
		return resultado;
	}
	
	public static List<Consultorio> getConsultorios(int numeroDeConsultorios) {
		List<Consultorio> resultado = new ArrayList<Consultorio>();
		Random random = new Random();
		
		for(int i = 0; i < numeroDeConsultorios; i++) {
			resultado.add(new Consultorio(String.valueOf(random.nextInt(5) + 1), String.valueOf(random.nextInt(3) + 1)));
		}
		
		return resultado;
	}
}

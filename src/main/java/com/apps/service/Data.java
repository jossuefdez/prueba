package com.apps.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.apps.model.Consultorio;
import com.apps.model.Doctor;
import com.apps.utils.Util;

@Service
public class Data {

	public List<Doctor> getDoctores() {
		return Util.getDoctors(5);
	}
	
	public List<Consultorio> getConsultorios() {
		return Util.getConsultorios(5);
	}
}

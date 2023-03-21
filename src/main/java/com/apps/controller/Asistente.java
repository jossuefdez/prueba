package com.apps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apps.service.Data;
import com.apps.utils.Util;

@Controller
@RequestMapping(value = "asistente")
public class Asistente {

	@Autowired
	private Data data;
	
	@GetMapping(value = "altadecitas")
	public String altaCitas(Model model) {
		return "alta_de_citas";
	}
	
	@RequestMapping(value = "info", method = RequestMethod.GET)
	public String printData() {
		return String.format("%s\n%s", Util.getDoctors(5), Util.getConsultorios(3));
	}
}

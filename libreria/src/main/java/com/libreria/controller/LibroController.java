package com.libreria.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.libreria.model.Libro;
import com.libreria.service.ILibro;


@RequestMapping("/libro")
@Controller
public class LibroController {
	
//	@Autowired
//	ILibro ilibro;

	@GetMapping("/obtener")
	public ArrayList<Libro> obtener() {
		Libro libro = new Libro();
		System.out.println(libro.obtenerDatos());
		//ArrayList<Libro> libros =  (ArrayList<Libro>) ilibro.findAll();
		//System.out.println(libros);
		return null;
	}
	
}

//package com.libreria.model;
//
//import java.util.ArrayList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.libreria.service.ILibro;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;
//
//import lombok.Data;
//
//
//@Data
//@Entity
//@Table(name = "libro")
//public class LibroA {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    
//    private String nombre;
//    
//    private String descripcion;
//    
//    @Autowired
//    ILibro ilibro;
//
//    @ManyToOne
//    @JoinColumn(name = "categoria_id")
//    private CategoriaA categoria;
//
//
//	public ArrayList<LibroA> obtenerLibros(LibroA libro) {
//		ArrayList<LibroA> obtenerLibros = (ArrayList<LibroA>) ilibro.findAll();
////		ArrayList<Libro> obtenerLibros = new ArrayList<>();
////		for (int i = 0; i < obtenerLibros.length; i++) {
////			ArrayList<Libro> libro = obtenerLibros[i];
////			
////		}
//		return obtenerLibros;
//	}
//    // Getters y setters
//
//    // Constructor por defecto y otros constructores si es necesario
//}
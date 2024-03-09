package com.loricode.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loricode.model.Producto;
import com.loricode.services.ProductoService;

@RestController
@CrossOrigin
@RequestMapping("/api/productos")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@GetMapping("list")
	public ResponseEntity<List<Producto>> getListProducto(){
		return ResponseEntity.ok(productoService.getListProducto());
	}
	
	@PostMapping("add")
	public ResponseEntity<Boolean> addProducto(@RequestBody Producto producto){
		return ResponseEntity.ok(
				productoService.addProducto(producto.getNombre(), producto.getFec_registro()));
	}
	
}

package com.loricode.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loricode.model.Producto;
import com.loricode.repositories.IProductoRepository;

@Service
public class ProductoService {
	
	@Autowired
	private IProductoRepository Iproducto;


	public List<Producto> getListProducto () {
		return Iproducto.getListProducto();	
	}

	public boolean addProducto(String nombre, String fec_registro) {
		try {
			Iproducto.addProducto(nombre, fec_registro);
			return true;
			
		}catch (Exception e) {
			//
		}
		
		return false;
	}
	
}

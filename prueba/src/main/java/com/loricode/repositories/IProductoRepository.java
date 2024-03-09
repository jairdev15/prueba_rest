package com.loricode.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.loricode.model.Producto;

import jakarta.transaction.Transactional;


@EnableJpaRepositories
@Repository
public interface IProductoRepository extends JpaRepository<Producto, String> {

  @Query(value="{ call sp_ejemplo() }", nativeQuery = true)
  public List<Producto> getListProducto();

  @Modifying
  @Query(value="{ call sp_crear_producto(:nombre, :fec_registro) }", nativeQuery = true)
  @Transactional
  public void addProducto(String nombre, String fec_registro);
 
}

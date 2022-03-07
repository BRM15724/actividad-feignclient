package com.actividaddia9.actividad.domain.service;

import com.actividaddia9.actividad.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "actividad", url = "http://localhost:8090/api/productos")
public interface VentaService {

    @GetMapping("")
    List<Product> getAll();

    @GetMapping("/{idProducto}")
    Product getProduct(@PathVariable("idProducto") int idProducto);

}

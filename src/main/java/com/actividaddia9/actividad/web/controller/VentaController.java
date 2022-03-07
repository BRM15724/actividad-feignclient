package com.actividaddia9.actividad.web.controller;

import com.actividaddia9.actividad.domain.Product;
import com.actividaddia9.actividad.domain.service.VentaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @GetMapping("")
    public List<Product> getAll(HttpServletRequest request){
        return ventaService.getAll();
    }

    @GetMapping("/{idProducto}")
    public Product getSellProduct(@PathVariable("idProducto") int idProducto){
        return ventaService.getProduct(idProducto);
    }

}

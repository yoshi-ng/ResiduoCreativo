package com.grupo5.residuocreativo.controller;

import com.grupo5.residuocreativo.models.Producto;
import com.grupo5.residuocreativo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/lista")
    public List<Producto> listaProducto(){
        return productoService.findAllProducto();
    }

    @GetMapping("/{id}")
    public Producto getProductoById(@PathVariable Long id){
        return productoService.findProductoById(id);
    }

}

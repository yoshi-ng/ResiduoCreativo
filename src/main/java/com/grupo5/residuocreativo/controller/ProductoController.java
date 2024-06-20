package com.grupo5.residuocreativo.controller;

import com.grupo5.residuocreativo.models.Categoria;
import com.grupo5.residuocreativo.models.Producto;
import com.grupo5.residuocreativo.service.ProductoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
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
        return productoService.getProductoById(id);
    }

    @PostMapping("/agregar")
    public ResponseEntity<?> agregarProducto(@RequestBody @Valid Producto productoNuevo, BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>("Verifique los campos", HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>(productoService.saveProducto(productoNuevo) ,HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<?> actualizarProducto(@RequestBody @Valid Producto productoActualizar, BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>("Verifique los campos", HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>(productoService.saveProducto(productoActualizar) ,HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<?> eliminarProducto(@RequestParam @Valid Long id) {
        productoService.deleteProducto(id);
        return new ResponseEntity<>("Eliminado exitosamente", HttpStatus.OK);
    }
}

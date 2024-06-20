package com.grupo5.residuocreativo.controller;

import com.grupo5.residuocreativo.models.Categoria;
import com.grupo5.residuocreativo.service.CategoriaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/lista")
    public List<Categoria> listaCategoria() {
        return categoriaService.findAllCategoria();
    }

    @GetMapping("/{id}")
    public Categoria getCategoriaById (@PathVariable Long id) {
        return categoriaService.getCategoriaById(id);
    }

    @PostMapping("/agregar")
    public ResponseEntity<?> agregarCategoria(@RequestBody @Valid Categoria categoriaNueva, BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>("Verifique los campos", HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>(categoriaService.saveCategoria(categoriaNueva) ,HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<?> actualizarCategoria(@RequestBody @Valid Categoria categoriaActualizar, BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>("Verifique los campos antes de actualizar", HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>(categoriaService.saveCategoria(categoriaActualizar) ,HttpStatus.OK);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<?> eliminarCategoria(@RequestParam @Valid Long id) {
        categoriaService.deleteCategoria(id);
        return new ResponseEntity<>("Eliminado exitosamente", HttpStatus.OK);
    }

}

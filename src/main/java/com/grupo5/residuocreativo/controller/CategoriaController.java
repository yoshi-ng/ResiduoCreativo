package com.grupo5.residuocreativo.controller;

import com.grupo5.residuocreativo.models.Categoria;
import com.grupo5.residuocreativo.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
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
        return categoriaService.findCategoriaById(id);
    }

}

package com.grupo5.residuocreativo.service;

import com.grupo5.residuocreativo.models.Categoria;
import com.grupo5.residuocreativo.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAllCategoria() {
        return categoriaRepository.findAll();
    }

    public Categoria findCategoriaById(Long id) {
        return categoriaRepository.findById(id).get();
    }

}

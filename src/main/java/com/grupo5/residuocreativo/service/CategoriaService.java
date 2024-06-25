package com.grupo5.residuocreativo.service;

import com.grupo5.residuocreativo.models.Categoria;
import com.grupo5.residuocreativo.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAllCategoria() {
        return categoriaRepository.findAll();
    }

    public Categoria getCategoriaById(Long id) {
        var categoriaId = categoriaRepository.findById(id);
        return categoriaId.get();
    }

    @Transactional
    public Categoria saveCategoria(Categoria categoria) {
        Categoria categoriaGuardar = categoriaRepository.save(categoria);
        return categoriaGuardar;
    }

    @Transactional
    public Categoria updateCategoria(Categoria categoria) {
        Categoria categoriaActualizar =  categoriaRepository.save(categoria);
        return categoriaActualizar;
    }

    @Transactional
    public void deleteCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }

}

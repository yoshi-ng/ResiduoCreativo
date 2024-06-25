package com.grupo5.residuocreativo.service;

import com.grupo5.residuocreativo.models.Comuna;
import com.grupo5.residuocreativo.repository.ComunaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ComunaService {

    @Autowired
    private ComunaRepository comunaRepository;

    public List<Comuna> findAllComunas() {
        return comunaRepository.findAll();
    }

    public Comuna getComunaById(Long id) {
        var comunaId = comunaRepository.findById(id);
        return comunaId.get();
    }

    @Transactional
    public Comuna saveComuna(Comuna comuna) {
        var comunaGuardar = comunaRepository.save(comuna);
        return comunaGuardar;
    }

    @Transactional
    public Comuna updateComuna(Comuna comuna) {
        Comuna comunaActualizar = comunaRepository.save(comuna);
        return comunaActualizar;
    }

    @Transactional
    public void deleteComuna(Long id) {
        comunaRepository.deleteById(id);
    }
}

package com.grupo5.residuocreativo.service;

import com.grupo5.residuocreativo.models.Tienda;
import com.grupo5.residuocreativo.repository.TiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TiendaService {

    @Autowired
    private TiendaRepository tiendaRepository;

    public List<Tienda> findAllTiendas(){
        return tiendaRepository.findAll();
    }

    public Tienda getTiendaById(Long id){
        var tiendaId = tiendaRepository.findById(id);
        return tiendaId.get();
    }

    @Transactional
    public Tienda saveTienda(Tienda tienda){
        Tienda tiendaGuardar = tiendaRepository.save(tienda);
        return tiendaGuardar;
    }

    @Transactional
    public Tienda updateTienda(Tienda tienda){
        var tiendaActualizar = tiendaRepository.save(tienda);
        return tiendaActualizar;
    }

    @Transactional
    public void deleteTienda(Long id){
        tiendaRepository.deleteById(id);
    }
}

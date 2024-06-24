package com.grupo5.residuocreativo.service;

import com.grupo5.residuocreativo.models.PagosDisponibles;
import com.grupo5.residuocreativo.repository.PagoDisponiblesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagosDisponiblesService {

    @Autowired
    private PagoDisponiblesRepository pagoDisponiblesRepository;

    public List<PagosDisponibles> findAllPagosDisponibles() {
        return pagoDisponiblesRepository.findAll();
    }

    public PagosDisponibles getPagoDisponibleById(Long id) {
        var pagoDisponibleId = pagoDisponiblesRepository.findById(id);
        return pagoDisponibleId.get();
    }

    public PagosDisponibles savePagoDisponible(PagosDisponibles pago) {
        return pagoDisponiblesRepository.save(pago);
    }

    public PagosDisponibles updatePagoDisponible(PagosDisponibles pago) {
        return pagoDisponiblesRepository.save(pago);
    }

    public void deletePagoDisponible(Long id) {
        pagoDisponiblesRepository.deleteById(id);
    }
}

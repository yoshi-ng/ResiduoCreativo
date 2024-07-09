package com.grupo5.ResiduoCreativo.service;

import com.grupo5.ResiduoCreativo.models.PagoDisponible;
import com.grupo5.ResiduoCreativo.repository.PagoDisponibleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoDisponibleService {

    @Autowired
    private PagoDisponibleRepository pagoDisponiblesRepository;

    public List<PagoDisponible> findAllPagosDisponibles() {
        return pagoDisponiblesRepository.findAll();
    }

    public PagoDisponible getPagoDisponibleById(Long id) {
        var pagoDisponibleId = pagoDisponiblesRepository.findById(id);
        return pagoDisponibleId.get();
    }

    public PagoDisponible savePagoDisponible(PagoDisponible pago) {
        return pagoDisponiblesRepository.save(pago);
    }

    public PagoDisponible updatePagoDisponible(PagoDisponible pago) {
        return pagoDisponiblesRepository.save(pago);
    }

    public void deletePagoDisponible(Long id) {
        pagoDisponiblesRepository.deleteById(id);
    }
}

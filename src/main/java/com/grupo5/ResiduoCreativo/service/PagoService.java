package com.grupo5.ResiduoCreativo.service;

import com.grupo5.ResiduoCreativo.models.Pago;
import com.grupo5.ResiduoCreativo.repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoService {

    @Autowired
    private PagoRepository pagoRepository;

    public List<Pago> findAllPagos() {
        return pagoRepository.findAll();
    }

    public Pago getPagoById(Long id) {
        var pagoId = pagoRepository.findById(id);
        return pagoId.get();
    }

    public Pago savePago(Pago pago) {
        return pagoRepository.save(pago);
    }

    public Pago updatePago(Pago pago) {
        return pagoRepository.save(pago);
    }

    public void deletePago(Long id) {
        pagoRepository.deleteById(id);
    }
}


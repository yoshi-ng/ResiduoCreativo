package com.grupo5.residuocreativo.service;

import com.grupo5.residuocreativo.models.Pago;
import com.grupo5.residuocreativo.repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoService {
/*darling*/
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

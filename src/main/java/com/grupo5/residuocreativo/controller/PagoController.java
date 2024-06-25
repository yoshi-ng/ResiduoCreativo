package com.grupo5.residuocreativo.controller;

import com.grupo5.residuocreativo.models.Categoria;
import com.grupo5.residuocreativo.models.Pago;
import com.grupo5.residuocreativo.service.PagoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pagos")
public class PagoController {

    @Autowired
    private PagoService pagoService;

    @GetMapping("/lista")
    public List<Pago> listaPagos() {
        return pagoService.findAllPagos();
    }

    @GetMapping("/{id}")
    public Pago getCategoriaById (@PathVariable Long id) {
        return pagoService.getPagoById(id);
    }

    @PostMapping("/agregar")
    public ResponseEntity<?> agregarPago(@RequestBody @Valid Pago pagoNuevo, BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>("Verifique los campos", HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>(pagoService.savePago(pagoNuevo), HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<?> actualizarPago(@RequestBody @Valid Pago pagoActualizar, BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>("Verifique los campos antes de actualizar", HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>(pagoService.updatePago(pagoActualizar), HttpStatus.OK);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<?> eliminarPago(@RequestParam @Valid Long id) {
            pagoService.deletePago(id);
            return new ResponseEntity<>("Eliminado exitosamente", HttpStatus.OK);
    }
}

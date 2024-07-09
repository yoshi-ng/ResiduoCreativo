package com.grupo5.ResiduoCreativo.controller;

import com.grupo5.ResiduoCreativo.models.PagoDisponible;
import com.grupo5.ResiduoCreativo.service.PagoDisponibleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pagos-disponibles")
public class PagoDisponibleController {

    @Autowired
    private PagoDisponibleService pagoDisponibleService;

    @GetMapping("/lista")
    public List<PagoDisponible> listaPagosDisponibles() {
        return pagoDisponibleService.findAllPagosDisponibles();
    }

    @GetMapping("/{id}")
    public PagoDisponible getPagoDisponibleById (@PathVariable Long id) {
        return pagoDisponibleService.getPagoDisponibleById(id);
    }

    @PostMapping("/agregar")
    public ResponseEntity<?> agregarPagoDisponible(@RequestBody @Valid PagoDisponible pagoNuevo, BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>("Verifique los campos", HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>(pagoDisponibleService.savePagoDisponible(pagoNuevo), HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<?> actualizarPago(@RequestBody @Valid PagoDisponible pagoActualizar, BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>("Verifique los campos antes de actualizar", HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>(pagoDisponibleService.updatePagoDisponible(pagoActualizar), HttpStatus.OK);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<?> eliminarPago(@RequestParam @Valid Long id) {
        pagoDisponibleService.deletePagoDisponible(id);
        return new ResponseEntity<>("Eliminado exitosamente", HttpStatus.OK);
    }
}

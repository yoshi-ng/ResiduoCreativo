package com.grupo5.residuocreativo.controller;

import com.grupo5.residuocreativo.models.PagosDisponibles;
import com.grupo5.residuocreativo.service.PagosDisponiblesService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pagos-disponibles")
public class PagosDisponiblesController {

    @Autowired
    private PagosDisponiblesService pagoDisponibleService;

    @GetMapping("/lista")
    public List<PagosDisponibles> listaPagosDisponibles() {
        return pagoDisponibleService.findAllPagosDisponibles();
    }

    @GetMapping("/{id}")
    public PagosDisponibles getPagoDisponibleById (@PathVariable Long id) {
        return pagoDisponibleService.getPagoDisponibleById(id);
    }

    @PostMapping("/agregar")
    public ResponseEntity<?> agregarPagoDisponible(@RequestBody @Valid PagosDisponibles pagoNuevo, BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>("Verifique los campos", HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>(pagoDisponibleService.savePagoDisponible(pagoNuevo), HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<?> actualizarPago(@RequestBody @Valid PagosDisponibles pagoActualizar, BindingResult result) {
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

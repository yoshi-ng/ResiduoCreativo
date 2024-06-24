package com.grupo5.residuocreativo.controller;

import com.grupo5.residuocreativo.models.Comuna;
import com.grupo5.residuocreativo.service.ComunaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comunas")
public class ComunaController {

    @Autowired
    private ComunaService comunaService;

    @GetMapping("/lista")
    public List<Comuna> listaComuna() {
        return comunaService.findAllComunas();
    }

    @GetMapping("/{id}")
    public Comuna getComunaById(@PathVariable Long id) {
        return comunaService.getComunaById(id);
    }

    @PostMapping("/agregar")
    public ResponseEntity<?> agregarComuna(@RequestBody @Valid Comuna comunaNueva, BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>("Verifique los campos", HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>(comunaService.saveComuna(comunaNueva),HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<?> actualizarComuna(@RequestBody @Valid Comuna comunaActualizar, BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>("Verifique los campos", HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>(comunaService.updateComuna(comunaActualizar),HttpStatus.OK);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<?> eliminarComuna(@RequestParam Long id) {
        return new ResponseEntity<>("Eliminando existosamente", HttpStatus.OK);
    }
}

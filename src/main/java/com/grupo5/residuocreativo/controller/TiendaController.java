package com.grupo5.residuocreativo.controller;

import com.grupo5.residuocreativo.models.Tienda;
import com.grupo5.residuocreativo.service.TiendaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tienda")
public class TiendaController {

    @Autowired
    private TiendaService tiendaService;

    @GetMapping("/lista")
    public List<Tienda> lista(){
        return tiendaService.findAllTiendas();
    }

    @GetMapping("/{id}")
    public Tienda getTiendaById(@PathVariable Long id){
        return tiendaService.getTiendaById(id);
    }

    @PostMapping("/agregar")
    public ResponseEntity<?> agregarTienda(@RequestBody @Valid Tienda tiendaNueva, BindingResult result){
        if(result.hasErrors()){
            return new ResponseEntity<>("Verifique los campos", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(tiendaService.saveTienda(tiendaNueva), HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<?> actualizarTienda(@RequestBody @Valid Tienda tiendaActualizar, BindingResult result){
        if(result.hasErrors()){
            return new ResponseEntity<>("Verifique los campos", HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>(tiendaService.updateTienda(tiendaActualizar), HttpStatus.OK);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<?> eliminarTienda(@RequestParam @Valid Long id){
        tiendaService.deleteTienda(id);
        return new ResponseEntity<>("Eliminado exitosamente",HttpStatus.OK);
    }
}

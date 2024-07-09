package com.grupo5.residuocreativo.controller;

import com.grupo5.residuocreativo.models.Emprendedor;
import com.grupo5.residuocreativo.models.Tienda;
import com.grupo5.residuocreativo.service.EmprendedorService;
import com.grupo5.residuocreativo.service.TiendaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Emprendedor")
public class EmprendedorController {

    @Autowired
    private EmprendedorService emprendedorService;

    @GetMapping("/lista")
    public List<Emprendedor> lista(){
        return emprendedorService.findAllEmprendedor();
    }

    @GetMapping("/{id}")
    public Emprendedor getTiendaById(@PathVariable Long id){
        return emprendedorService.getEmprendedorById();
    }

    @PostMapping("/agregar")
    public ResponseEntity<?> agregarEmprendedor(@RequestBody @Valid Emprendedor emprendedorNuevo, BindingResult result){
        if(result.hasErrors()){
            return new ResponseEntity<>("Verifique los campos", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(emprendedorService.saveEmprendedor(emprendedorNuevo), HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<?> actualizarEmprendedor(@RequestBody @Valid Emprendedor emprendedorActualizar, BindingResult result){
        if(result.hasErrors()){
            return new ResponseEntity<>("Verifique los campos", HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>(emprendedorService.updateEmprendedor(emprendedorActualizar), HttpStatus.OK);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<?> eliminarEmprendedor(@RequestParam @Valid Long id){
        emprendedorService.deleteEmprendedor(id);
        return new ResponseEntity<>("Eliminado exitosamente",HttpStatus.OK);
    }
}


package com.grupo5.residuocreativo.controller;

import com.grupo5.residuocreativo.models.Region;
import com.grupo5.residuocreativo.service.RegionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/region")
public class RegionController {

    @Autowired
    private RegionService regionService;

    @GetMapping("/lista")
    public List<Region> lista() {
        return regionService.findAllRegiones();
    }

    @GetMapping("/{id}")
    public Region getRegionById(@PathVariable Long id) {
        return regionService.getRegionById(id);
    }

    @PostMapping("/agregar")
    public ResponseEntity<?> agregarRegion(@RequestBody @Valid Region regionNuevo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(regionService.saveRegion(regionNuevo), HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>(regionService.saveRegion(regionNuevo), HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<?> actualizarRegion(@RequestBody @Valid Region regionActualizar, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>("Verifique los campos", HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>(regionService.updateRegion(regionActualizar), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<?> eliminarRegion(@RequestParam @Valid Long id) {
        regionService.deleteRegion(id);
        return new ResponseEntity<>("Eliminado exitosamente",HttpStatus.OK);
    }
}

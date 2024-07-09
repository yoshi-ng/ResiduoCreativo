package com.grupo5.ResiduoCreativo.service;

import com.grupo5.ResiduoCreativo.models.Emprendedor;
import com.grupo5.ResiduoCreativo.repository.EmprendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmprendedorService {

    @Autowired
    private EmprendedorRepository emprendedorRepository;

    public List<Emprendedor> findAllEmprendedor() {
        return emprendedorRepository.findAll();
    }

    public Emprendedor getEmprendedorById(Long id) {
        var emprendedorId = emprendedorRepository.findById(id);
        return emprendedorId.get();
    }

    @Transactional
    public Emprendedor saveEmprendedor(Emprendedor emprendedor) {
        Emprendedor emprendedorGuardar = emprendedorRepository.save(emprendedor);
        return emprendedorGuardar;
    }

    @Transactional
    public Emprendedor updateEmprendedor(Emprendedor emprendedor) {
        Emprendedor emprendedorActualizar =  emprendedorRepository.save(emprendedor);
        return emprendedorActualizar;
    }

    @Transactional
    public void deleteEmprendedor(Long id) {
        emprendedorRepository.deleteById(id);
    }

}
package com.grupo5.residuocreativo.service;

import com.grupo5.residuocreativo.models.Producto;
import com.grupo5.residuocreativo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productosRepository;

    public List<Producto> findAllProducto() {
        return productosRepository.findAll();
    }

    public Producto findProductoById(Long id) {
        var producto = productosRepository.findById(id);
        return producto.get();
    }

}

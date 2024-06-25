package com.grupo5.residuocreativo.service;

import com.grupo5.residuocreativo.models.Producto;
import com.grupo5.residuocreativo.repository.ProductoRepository;
import org.springframework.transaction.annotation.Transactional;
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

    public Producto getProductoById(Long id) {
        var productoId = productosRepository.findById(id);
        return productoId.get();
    }

    @Transactional
    public Producto saveProducto(Producto producto) {
        Producto productoGuardar = productosRepository.save(producto);
        return productoGuardar;
    }

    @Transactional
    public Producto updateProducto(Producto producto) {
        Producto productoActualizar = productosRepository.save(producto);
        return productoActualizar;
    }

    @Transactional
    public void deleteProducto(Long id) {
        productosRepository.deleteById(id);
    }

}

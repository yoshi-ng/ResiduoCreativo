package com.grupo5.ResiduoCreativo.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductoDTO {

    private long idProducto;
    private String nombre;
    private String descripcion;
    private String imagen;
    private int cantidad;
    private int precio;
    private Categoria categoria;
    private Tienda tienda;

}

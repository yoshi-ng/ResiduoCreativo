package com.grupo5.residuocreativo.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "productos")
@Data
@NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private String imagen;
    private int precio;
    private int stock;

    @CreationTimestamp
    private LocalDateTime fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoriaProducto;

    /*@ManyToOne
    @JoinColumn(name = "tienda_id")
    private Tienda tiendaProducto;

    //Copiar en clase Tienda
    @OneToMany(mappedBy = "tiendaProducto")
    private List<Tienda> productoTienda;*/
}

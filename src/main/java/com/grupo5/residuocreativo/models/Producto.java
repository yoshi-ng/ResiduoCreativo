package com.grupo5.residuocreativo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "productos")
@Data
@NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nombre;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String imagen;
    @NotBlank
    private int precio;
    @NotBlank
    private int stock;

    @CreationTimestamp
    @NotBlank
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

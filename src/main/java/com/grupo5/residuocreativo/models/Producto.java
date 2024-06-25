package com.grupo5.residuocreativo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
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

    @NotNull
    private int precio;

    @NotNull
    private int stock;

    @CreationTimestamp
    private LocalDateTime fechaCreacion;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoriaProducto;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_tienda")
    private Tienda tiendaProducto;
}

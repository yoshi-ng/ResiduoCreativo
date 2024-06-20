package com.grupo5.residuocreativo.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

import java.util.List;

@Entity
@Table(name = "categorias")
@Data
@NoArgsConstructor
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @CreationTimestamp
    private LocalDateTime fechaCreacion;

    @OneToMany(mappedBy = "categoriaProducto")
    private List<Producto> productoCategoria;
}

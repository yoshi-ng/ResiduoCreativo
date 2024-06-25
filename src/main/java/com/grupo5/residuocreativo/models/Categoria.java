package com.grupo5.residuocreativo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
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

    @NotBlank
    private String nombre;

    @CreationTimestamp
    private LocalDateTime fechaCreacion;

    @JsonIgnore
    @OneToMany(mappedBy = "categoriaProducto")
    private List<Producto> productoCategoria;
}

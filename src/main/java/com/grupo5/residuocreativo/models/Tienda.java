package com.grupo5.residuocreativo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tiendas")
@Data
@NoArgsConstructor
public class Tienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nombre;

    @NotBlank
    private String descripcion;

    @NotBlank
    private String instagram;

    @NotBlank
    private String facebook;

    @NotNull
    private int telefono;

    @NotBlank
    private String email;

    @NotBlank
    private String direccion;

    @CreationTimestamp
    private LocalDateTime fechaCreacion;

    @JsonIgnore
    @OneToMany(mappedBy = "tiendaProducto")
    private List<Producto> productoTienda;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_comuna")
    private Comuna tiendaComuna;

}

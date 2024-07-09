package com.grupo5.residuocreativo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table (name = "Emprendedores")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Emprendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nombre;

    @NotBlank
    private String apellido;

    @NotBlank
    private String rut;

    @NotBlank
    private String correo;

    @NotNull
    private Integer telefono;

    @NotBlank
    private String contrasena;

    @NotNull
    private String direccion;


}

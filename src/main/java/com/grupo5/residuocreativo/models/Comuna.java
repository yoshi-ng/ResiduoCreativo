package com.grupo5.residuocreativo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "comunas")
@Data
@NoArgsConstructor
public class Comuna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nombre;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_region")
    private Region region;

    @JsonIgnore
    @OneToMany(mappedBy = "tiendaComuna")
    private List<Tienda> tienda;
}

package com.grupo5.ResiduoCreativo.models;

import com.grupo5.ResiduoCreativo.models.Region;
import com.grupo5.ResiduoCreativo.models.Tienda;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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

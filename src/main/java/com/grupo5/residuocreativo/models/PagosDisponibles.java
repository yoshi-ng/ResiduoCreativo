package com.grupo5.residuocreativo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import com.grupo5.residuocreativo.models.Pago;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pagos_disponible")
@Data
@NoArgsConstructor
public class PagosDisponibles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_pago", nullable = false)
    private Pago pagos;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_tienda")
    private Tienda tiendaPagosDisponibles;

}
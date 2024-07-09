package com.grupo5.ResiduoCreativo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pagos_disponible")
@Data
@NoArgsConstructor
public class PagoDisponible {

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
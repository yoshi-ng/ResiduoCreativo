package com.grupo5.residuocreativo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.grupo5.residuocreativo.models.Pago;


@Repository
public interface PagoRepository extends JpaRepository<Pago, Long> {
}

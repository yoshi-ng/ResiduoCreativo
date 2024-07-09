package com.grupo5.ResiduoCreativo.repository;

import com.grupo5.ResiduoCreativo.models.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PagoRepository extends JpaRepository<Pago, Long> {
}

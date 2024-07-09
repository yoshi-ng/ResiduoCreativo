package com.grupo5.ResiduoCreativo.repository;

import com.grupo5.ResiduoCreativo.models.PagoDisponible;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoDisponibleRepository extends JpaRepository<PagoDisponible, Long> {
}

package com.grupo5.ResiduoCreativo.repository;

import com.grupo5.residuocreativo.models.Tienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiendaRepository extends JpaRepository<Tienda, Long> {

}
package com.grupo5.ResiduoCreativo.repository;

import com.grupo5.ResiduoCreativo.models.Comuna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComunaRepository extends JpaRepository<Comuna, Long> {

}

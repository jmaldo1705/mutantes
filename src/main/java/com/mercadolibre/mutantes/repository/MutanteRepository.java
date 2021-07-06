package com.mercadolibre.mutantes.repository;

import com.mercadolibre.mutantes.entity.Mutante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MutanteRepository extends JpaRepository<Mutante, String> {
    double countByIsMutantTrue();
    double countByIsMutantFalse();
}

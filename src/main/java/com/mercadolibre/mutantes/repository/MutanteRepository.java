package com.mercadolibre.mutantes.repository;

import com.mercadolibre.mutantes.entity.Mutante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MutanteRepository extends JpaRepository<Mutante, String> {
    double countByIsMutantTrue();
    double countByIsMutantFalse();
}

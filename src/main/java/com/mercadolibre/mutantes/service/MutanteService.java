package com.mercadolibre.mutantes.service;

import com.google.gson.Gson;
import com.mercadolibre.mutantes.dto.MutanteStatsDTO;
import com.mercadolibre.mutantes.entity.Mutante;
import com.mercadolibre.mutantes.repository.MutanteRepository;
import com.mercadolibre.mutantes.util.Utilitarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MutanteService {

    @Autowired
    MutanteRepository mutanteRepository;

    @Autowired
    Utilitarios utilitarios;

    public Mutante save(Mutante mutante){
        return mutanteRepository.save(mutante);
    }

    public MutanteStatsDTO consultaEstadisticas(){
        return utilitarios.buildMutantDTO(mutanteRepository.countByIsMutantTrue(), mutanteRepository.countByIsMutantFalse());
    }

}

package com.mercadolibre.mutantes.util;

import com.mercadolibre.mutantes.dto.MutanteStatsDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilitariosTest {

    Utilitarios utilitarios = new Utilitarios();

    @Test
    void buildMutantDTO() {
        MutanteStatsDTO respuestaServicio = utilitarios.buildMutantDTO(1,1);
        Assertions.assertEquals(1, respuestaServicio.getCountMutantDna());
        Assertions.assertEquals(1, respuestaServicio.getCountHumanDna());
        Assertions.assertEquals(1, respuestaServicio.getRatio());
    }
}
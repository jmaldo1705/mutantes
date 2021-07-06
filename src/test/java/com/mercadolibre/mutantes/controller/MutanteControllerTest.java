package com.mercadolibre.mutantes.controller;

import com.google.gson.Gson;
import com.mercadolibre.mutantes.dto.MensajeDTO;
import com.mercadolibre.mutantes.dto.MutanteStatsDTO;
import com.mercadolibre.mutantes.dto.RequestDTO;
import com.mercadolibre.mutantes.entity.Mutante;
import com.mercadolibre.mutantes.repository.MutanteRepository;
import com.mercadolibre.mutantes.service.MutanteService;
import com.mercadolibre.mutantes.util.Utilitarios;
import org.apache.coyote.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class MutanteControllerTest {

    MutanteService mutanteServiceMock = Mockito.mock(MutanteService.class);

    Utilitarios utilitarios = new Utilitarios();

    MutanteController mutanteController = new MutanteController(mutanteServiceMock, utilitarios);

    @BeforeEach
    void setUp() {
        Mockito.when(mutanteServiceMock.save(Mockito.any(Mutante.class))).thenReturn(new Mutante());
    }

    @Test
    void validaMutanteEsMutante() {
        RequestDTO requestDTO = new RequestDTO();
        requestDTO.setDna(new String[]{"ATGCGA", "AATTGC", "ATATGT", "AGAATG", "CCCCTA", "TCACTG"});
        ResponseEntity<MensajeDTO> respuestaServicio = mutanteController.validaMutante(requestDTO);
        Assertions.assertEquals("Es mutante", Objects.requireNonNull(respuestaServicio.getBody()).getMensaje());
    }

    @Test
    void validaMutanteEsHumano() {
        RequestDTO requestDTO = new RequestDTO();
        requestDTO.setDna(new String[]{"ATGCGA", "GAGTGC", "ATATGT", "AGAATG", "CTCCTA", "TCACTG"});
        ResponseEntity<MensajeDTO> respuestaServicio = mutanteController.validaMutante(requestDTO);
        Assertions.assertEquals("No es mutante", Objects.requireNonNull(respuestaServicio.getBody()).getMensaje());
    }

    @Test
    void validaMutanteError() {
        RequestDTO requestDTO = new RequestDTO();
        requestDTO.setDna(new String[]{"ATGCgA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"});
        ResponseEntity<MensajeDTO> respuestaServicio = mutanteController.validaMutante(requestDTO);
        Assertions.assertEquals("El dna enviado no es correcto", Objects.requireNonNull(respuestaServicio.getBody()).getMensaje());
    }

    @Test
    void estadisticas() {
        MutanteStatsDTO mutanteStatsDTO = new MutanteStatsDTO();
        mutanteStatsDTO.setCountMutantDna(1);
        mutanteStatsDTO.setCountHumanDna(1);
        mutanteStatsDTO.setRatio(1);
        Mockito.when(mutanteServiceMock.consultaEstadisticas()).thenReturn(mutanteStatsDTO);
        ResponseEntity<MutanteStatsDTO> respuestaServicio = mutanteController.estadisticas();
        Assertions.assertEquals(1, Objects.requireNonNull(respuestaServicio.getBody()).getCountMutantDna());
        Assertions.assertEquals(1, Objects.requireNonNull(respuestaServicio.getBody()).getCountHumanDna());
        Assertions.assertEquals(1, Objects.requireNonNull(respuestaServicio.getBody()).getRatio());
    }
}
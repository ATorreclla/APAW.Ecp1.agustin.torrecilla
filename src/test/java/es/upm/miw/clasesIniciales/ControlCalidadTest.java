package es.upm.miw.clasesIniciales;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControlCalidadTest {

    private ControlCalidad controlCalidad;

    @BeforeEach
    void before() {
        controlCalidad = new ControlCalidad("234-001", "Puntualidad", true);
    }

    @Test
    void testControlCalidad() {
        controlCalidad = new ControlCalidad("234-002", "Higiene", true);
        assertEquals("234-002", controlCalidad.getId());
        assertEquals("Higiene", controlCalidad.getTexto());
        assertEquals(true, controlCalidad.getValoracion());
    }
}
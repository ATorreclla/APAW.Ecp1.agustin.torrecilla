package es.upm.miw.clasesIniciales;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConductorTest {

    private Conductor conductor;

    @BeforeEach
    void before(){
        conductor = new Conductor("5346765T", "Benito-Gomez-Ruiz", "666895632");
    }

    @Test
    void testConductor(){
        conductor = new Conductor("4576587V", "Rosa-Martin-Perez", "667465324");
        assertEquals("4576587V", conductor.getId());
        assertEquals("Rosa-Martin-Perez", conductor.getNombre());
        assertEquals("667465324", conductor.getTelefono());
    }
}

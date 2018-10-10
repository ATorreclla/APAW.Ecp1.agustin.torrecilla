package es.upm.miw.patronbuilder;

import es.upm.miw.clasesiniciales.Conductor;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConductorBuilderTest {

    private Conductor conductor;

    @BeforeEach
    void before(){
        this.conductor = new ConductorBuilder().setId("1").setNombre("Roberto Garcia Martin").setTelefono("667854937").build();
    }

    @Test
    void testConductorBuilder(){
        assertEquals("1", conductor.getId());
        assertEquals("Roberto Garcia Martin", conductor.getNombre());
        assertEquals("667854937", conductor.getTelefono());
    }

    @Test
    void testConductorBuilderStringId() {
        this.conductor = new ConductorBuilder("8").build();
        assertEquals("8", conductor.getId());
        assertEquals(null, conductor.getNombre());
        assertEquals(null, conductor.getTelefono());
    }

    @Test
    void testId() {
        assertEquals("1", conductor.getId());
    }

    @Test
    void testNombre() {
        assertEquals("Roberto Garcia Martin", conductor.getNombre());
    }

    @Test
    void testTelefono() {
        assertEquals("667854937", conductor.getTelefono());
    }

    @Test
    void testConductorZeroBuilder() {
        this.conductor = new ConductorBuilder().build();
        assertEquals("0", conductor.getId());
        assertEquals(null, conductor.getNombre());
        assertEquals(null, conductor.getTelefono());
    }
}
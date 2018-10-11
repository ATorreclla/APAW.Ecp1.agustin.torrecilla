package es.upm.miw.patronfactoriasingleton;

import es.upm.miw.clasesiniciales.ControlCalidad;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoriaControlCalidadSingletonTest {

    private static FactoriaSingleton factoriaSingleton;

    private static ControlCalidad controlCalidad;

    @BeforeEach
    void before() {
        factoriaSingleton = FactoriaSingleton.getInstance();
        controlCalidad = new ControlCalidad("77", "Servicio puntual", true);
        factoriaSingleton.setControlCalidad(controlCalidad);
        controlCalidad = new ControlCalidad("55", "Recorrido rapido", true);
        factoriaSingleton.setControlCalidad(controlCalidad);
        controlCalidad = new ControlCalidad("88", "Falta de prevision", false);
        factoriaSingleton.setControlCalidad(controlCalidad);
    }

    @Test
    void testControlCalidad(){
        ControlCalidad control;
        control = factoriaSingleton.getControlCalidad("77");
        assertEquals("77", control.getId());
        assertEquals(true, control.getValoracion());
        assertEquals("Servicio puntual", control.getTexto());
        control = factoriaSingleton.getControlCalidad("55");
        assertEquals("55", control.getId());
        assertEquals(true, control.getValoracion());
        assertEquals("Recorrido rapido", control.getTexto());
        control = factoriaSingleton.getControlCalidad("88");
        assertEquals("88", control.getId());
        assertEquals(false, control.getValoracion());
        assertEquals("Falta de prevision", control.getTexto());
    }
}
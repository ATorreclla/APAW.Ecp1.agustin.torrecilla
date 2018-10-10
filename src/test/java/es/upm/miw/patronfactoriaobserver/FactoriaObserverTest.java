package es.upm.miw.patronfactoriaobserver;

import es.upm.miw.clasesiniciales.ControlCalidad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactoriaObserverTest {

    private static FactoriaObservable factoriaObservable;

    private static FactoriaObserver factoriaObserver;

    private static ControlCalidad control;

    @BeforeEach
    void before(){
        factoriaObservable = FactoriaObservable.getInstance();
        control = new ControlCalidad("101", "Servicio Excelente", true);
    }

    @Test
    void testUpdate(){
        factoriaObserver = new FactoriaObserver(factoriaObservable);
        factoriaObservable.setControlCalidad(control);
    }
}

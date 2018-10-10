package es.upm.miw.patronfactoriaobserver;

import es.upm.miw.clasesiniciales.ControlCalidad;

import java.util.Observable;

import java.util.HashMap;

import java.util.Map;

public class FactoriaObservable extends Observable {

    private static final FactoriaObservable factoria = new FactoriaObservable();

    private Map<String, ControlCalidad> controlesCalidad;

    public FactoriaObservable() {

        this.controlesCalidad = new HashMap<>();
    }

    public static FactoriaObservable getInstance() {
        return factoria;
    }

    public ControlCalidad getControlCalidad(String id) {
        return controlesCalidad.get(id);
    }

    public void removeControlCalidad(String id) {
        this.controlesCalidad.remove(id);
    }

    public void setControlCalidad(ControlCalidad controlCalidad) {
        controlesCalidad.put(controlCalidad.getId(), controlCalidad);
        notifyObservers("Se produjo una nota de Control de Calidad numero: " + controlCalidad.getId());
    }
}
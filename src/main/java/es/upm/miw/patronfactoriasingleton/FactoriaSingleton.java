package es.upm.miw.patronfactoriasingleton;

import es.upm.miw.clasesiniciales.ControlCalidad;

import java.util.Map;

import java.util.HashMap;

public class FactoriaSingleton {

    private static final FactoriaSingleton
            factoria = new FactoriaSingleton();

    private Map<String, ControlCalidad> controlesCalidad;

    public FactoriaSingleton() {
        this.controlesCalidad = new HashMap<>();
    }

    public static FactoriaSingleton getInstance() {
        return factoria;
    }

    public void setControlCalidad(ControlCalidad controlCalidad) {
        controlesCalidad.put(controlCalidad.getId(), controlCalidad);
    }

    public ControlCalidad getControlCalidad(String id) {
        return controlesCalidad.get(id);
    }

    public void removeControlCalidad(String id) {
        this.controlesCalidad.remove(id);
    }
}
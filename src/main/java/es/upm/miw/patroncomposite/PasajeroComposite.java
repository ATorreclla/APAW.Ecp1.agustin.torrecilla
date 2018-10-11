package es.upm.miw.patroncomposite;

import java.util.ArrayList;

import java.util.List;

public class PasajeroComposite implements PasajeroComponent {

    private String name;

    private  List<PasajeroComponent> grupoPasajeros;

    public PasajeroComposite(String name) {
        super();
        assert name != null;
        this.grupoPasajeros = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void add(PasajeroComponent pasajeroComponent) {
        assert pasajeroComponent != null;
        grupoPasajeros.add(pasajeroComponent);
    }
    @Override
    public void remove(PasajeroComponent pasajeroComponent) {
        assert pasajeroComponent != null;
        grupoPasajeros.remove(pasajeroComponent);
    }

    @Override
    public Boolean isComposite() {
        return true;
    }

    @Override
    public String view() {
        return this.name;
    }

    @Override
    public int size() {
        return grupoPasajeros.size();
    }
}
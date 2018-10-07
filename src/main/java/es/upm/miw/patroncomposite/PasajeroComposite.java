package es.upm.miw.patronComposite;

import java.util.Date;

import java.util.ArrayList;

import java.util.List;

public class PasajeroComposite implements PasajeroComponent {

    private String id;

    private Date fechaViaje;

    private Boolean discapacidad;

    private  List<PasajeroComponent> grupoPasajeros = new ArrayList<PasajeroComponent>();

    public PasajeroComposite(String id, Date fechaViaje, Boolean discapacidad) {
        super();
        this.id = id;
        this.fechaViaje = fechaViaje;
        this.discapacidad = discapacidad;
    }

    @Override
    public void add(PasajeroComponent pasajeroComponent) {
        grupoPasajeros.add(pasajeroComponent);
    }
    @Override
    public void remove(PasajeroComponent pasajeroComponent) {
        grupoPasajeros.remove(pasajeroComponent);
    }

    @Override
    public PasajeroComponent getChild(int id) {
        return grupoPasajeros.get(id);
    }
    @Override
    public Date getFechaViaje() {
        return this.fechaViaje;
    }
    @Override
    public Boolean getDiscapacidad() {
        return this.discapacidad;
    }
}
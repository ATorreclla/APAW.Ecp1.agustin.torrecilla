package es.upm.miw.clasesIniciales;

import java.util.List;

public class Autobus {

    private String id;

    private int capacidad;

    private Conductor conductor;

    private List<Pasajero> pasajeros;

    private LineaRegular lineaRegular;

    public Autobus(String id, int capacidad, Conductor conductor, List<Pasajero> pasajeros, LineaRegular lineaRegular){
        this.id = id;
        this.capacidad = capacidad;
        this.conductor = conductor;
        this.pasajeros = pasajeros;
        this.lineaRegular = lineaRegular;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public LineaRegular getLineaRegular() {
        return lineaRegular;
    }

    public void setLineaRegular(LineaRegular lineaRegular) {
        this.lineaRegular = lineaRegular;
    }
}
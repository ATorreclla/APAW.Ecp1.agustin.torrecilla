package es.upm.miw.patroncomposite;

import java.time.LocalDate;

public class PasajeroLeaf implements PasajeroComponent {
    private String id;
    private LocalDate fechaViaje;
    private Boolean discapacidad;

    public PasajeroLeaf(String id){
        super();
        assert id  != null;
        this.id = id;
    }

    public PasajeroLeaf(String id, LocalDate fechaViaje, Boolean discapacidad) {
        super();
        assert id  != null;
        assert fechaViaje  != null;
        assert discapacidad  != null;
        this.id = id;
        this.fechaViaje = fechaViaje;
        this.discapacidad = discapacidad;
    }

    @Override
    public void add(PasajeroComponent pasajeroComponent) {
        throw new UnsupportedOperationException("Operación imposible en hoja");
    }

    @Override
    public void remove(PasajeroComponent pasajeroComponent) {
        throw new UnsupportedOperationException("Operación imposible en hoja");
    }

    public LocalDate getFechaViaje() {
        return this.fechaViaje;
    }

    public Boolean getDiscapacidad() {
        return this.discapacidad;
    }

    public String getId(){
        return this.id;
    }

    public void setFechaViaje(LocalDate fechaViaje) {
        assert fechaViaje != null;
        this.fechaViaje = fechaViaje;
    }

    public void setDiscapacidad(Boolean discapacidad) {
        assert discapacidad  != null;
        this.discapacidad = discapacidad;
    }

    @Override
    public Boolean isComposite() {
        return false;
    }

    @Override
    public String view() {
        return this.getId();
    }

    @Override
    public int size() {
        return 0;
    }
}
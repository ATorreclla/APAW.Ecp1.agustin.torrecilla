package es.upm.miw.clasesiniciales;

import java.util.Date;

public class Pasajero {

    private String dni;
    private Date fechaViaje;
    private boolean discapacidad;

    public Pasajero( String dni, Date fechaViaje, boolean discapacidad){
        this.dni = dni;
        this.fechaViaje = fechaViaje;
        this.discapacidad = discapacidad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(Date fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }
}

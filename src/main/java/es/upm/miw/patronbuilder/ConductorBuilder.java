package es.upm.miw.patronbuilder;

import es.upm.miw.clasesiniciales.Conductor;

public class ConductorBuilder {

    private Conductor conductor;

    public ConductorBuilder(){
        this.conductor = new Conductor("0");
    }

    public ConductorBuilder(String id){
        this.conductor = new Conductor(id);
    }

    public ConductorBuilder setId(String id){
        this.conductor = new Conductor(id);
        return this;
    }

    public ConductorBuilder setNombre(String nombre){
        this.conductor.setNombre(nombre);
        return this;
    }

    public ConductorBuilder setTelefono(String telefono){
        this.conductor.setTelefono(telefono);
        return this;
    }

    public Conductor build(){
        return this.conductor;
    }
}
package es.upm.miw.patronComposite;
import java.util.Date;
public class PasajeroLeaf implements PasajeroComponent {
    private String id;
    private Date fechaViaje;
    private Boolean discapacidad;
    public PasajeroLeaf(String id){
        super();
        this.id = id;
    }
    public PasajeroLeaf(String id, Date fechaViaje, Boolean discapacidad) {
        super();
        this.id = id;
        this.fechaViaje = fechaViaje;
        this.discapacidad = discapacidad;
    }
    @Override
    public void add(PasajeroComponent pasajeroComponent) {
        //this is leaf node so this method is not applicable to this class.
    }
    @Override
    public void remove(PasajeroComponent pasajeroComponent) {
        //this is leaf node so this method is not applicable to this class.
    }
    @Override
    public PasajeroLeaf getChild(int id) {
        //this is leaf node so this method is not applicable to this class.
        return null;
    }
    @Override
    public Date getFechaViaje() {
        return this.fechaViaje;
    }
    @Override
    public Boolean getDiscapacidad() {
        return this.discapacidad;
    }
    public String getIdni(){
        return this.id;
    }
    public void setFechaViaje(Date fechaViaje) {
        this.fechaViaje = fechaViaje;
    }
    public void setDiscapacidad(Boolean discapacidad) {
        this.discapacidad = discapacidad;
    }
}
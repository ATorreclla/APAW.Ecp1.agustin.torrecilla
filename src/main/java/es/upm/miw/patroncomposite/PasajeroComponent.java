package es.upm.miw.patronComposite;

import java.util.Date;

public interface PasajeroComponent {
    public void add(PasajeroComponent pasajeroComponent);
    public void remove(PasajeroComponent pasajeroComponent);
    public PasajeroComponent getChild(int id);
    public Date getFechaViaje();
    public Boolean getDiscapacidad();
}

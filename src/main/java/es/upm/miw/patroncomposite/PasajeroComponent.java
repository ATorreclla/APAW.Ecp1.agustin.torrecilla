package es.upm.miw.patronComposite;

public interface PasajeroComponent {
    public void add(PasajeroComponent pasajeroComponent);
    public void remove(PasajeroComponent pasajeroComponent);
    public Boolean isComposite();
    public String view();
    public int size();
}

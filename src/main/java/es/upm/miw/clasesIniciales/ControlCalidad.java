package es.upm.miw.clasesIniciales;

public class ControlCalidad {

    private String id;
    private String texto;
    private Boolean valoracion;

    public ControlCalidad( String id, String texto, Boolean valoracion){
        this.id = id;
        this.texto = texto;
        this.valoracion = valoracion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Boolean getValoracion() {
        return valoracion;
    }

    public void setValoracion(Boolean valoracion) {
        this.valoracion = valoracion;
    }
}
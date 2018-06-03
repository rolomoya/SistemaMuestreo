package proyectoreq.sistemamuestreo.entidades;

public class Trabajadores {
    private Integer idTrabajador;
    private String alias;
    private String puesto;

    public Trabajadores(Integer idTrabajador, String alias, String puesto) {
        this.idTrabajador = idTrabajador;
        this.alias = alias;
        this.puesto = puesto;
    }

    public Integer getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(Integer idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}

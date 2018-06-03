package proyectoreq.sistemamuestreo.entidades;

public class Muestreos {
    private Integer idMuestreo;
    private String descripcion;
    private Integer cantObservaciones;
    private Integer idOperacion;
    private String FechaInicio;

    public Muestreos(Integer idMuestreo, String descripcion, Integer cantObservaciones, Integer idOperacion, String fechaInicio) {
        this.idMuestreo = idMuestreo;
        this.descripcion = descripcion;
        this.cantObservaciones = cantObservaciones;
        this.idOperacion = idOperacion;
        FechaInicio = fechaInicio;
    }

    public Integer getIdMuestreo() {
        return idMuestreo;
    }

    public void setIdMuestreo(Integer idMuestreo) {
        this.idMuestreo = idMuestreo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantObservaciones() {
        return cantObservaciones;
    }

    public void setCantObservaciones(Integer cantObservaciones) {
        this.cantObservaciones = cantObservaciones;
    }

    public Integer getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(Integer idOperacion) {
        this.idOperacion = idOperacion;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        FechaInicio = fechaInicio;
    }
}

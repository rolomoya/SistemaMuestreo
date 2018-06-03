package proyectoreq.sistemamuestreo.entidades;

public class TrabajadorXMuestreo {
    private Integer IdTrabajadorXMuestreo;
    private Integer IdTrabajador;
    private Integer IdMuestreo;

    public TrabajadorXMuestreo(Integer idTrabajadorXMuestreo, Integer idTrabajador, Integer idMuestreo) {
        IdTrabajadorXMuestreo = idTrabajadorXMuestreo;
        IdTrabajador = idTrabajador;
        IdMuestreo = idMuestreo;
    }

    public Integer getIdTrabajadorXMuestreo() {
        return IdTrabajadorXMuestreo;
    }

    public void setIdTrabajadorXMuestreo(Integer idTrabajadorXMuestreo) {
        IdTrabajadorXMuestreo = idTrabajadorXMuestreo;
    }

    public Integer getIdTrabajador() {
        return IdTrabajador;
    }

    public void setIdTrabajador(Integer idTrabajador) {
        IdTrabajador = idTrabajador;
    }

    public Integer getIdMuestreo() {
        return IdMuestreo;
    }

    public void setIdMuestreo(Integer idMuestreo) {
        IdMuestreo = idMuestreo;
    }
}

package proyectoreq.sistemamuestreo.entidades;

import java.io.Serializable;

public class ObservacionesXMuestreo implements Serializable {
    private Integer IdObservacionesXMuestreo;
    private Integer IdTarea;
    private Integer IdTrabajador;
    private Integer IdMuestreo;
    private String FechaHora;
    private Integer Temperatura;
    private Integer Humedad;

    public ObservacionesXMuestreo(Integer idObservacionesXMuestreo, Integer idTarea, Integer idTrabajador, Integer idMuestreo, String fechaHora, Integer temperatura, Integer humedad) {
        IdObservacionesXMuestreo = idObservacionesXMuestreo;
        IdTarea = idTarea;
        IdTrabajador = idTrabajador;
        IdMuestreo = idMuestreo;
        FechaHora = fechaHora;
        Temperatura = temperatura;
        Humedad = humedad;
    }

    public Integer getIdObservacionesXMuestreo() {
        return IdObservacionesXMuestreo;
    }

    public void setIdObservacionesXMuestreo(Integer idObservacionesXMuestreo) {
        IdObservacionesXMuestreo = idObservacionesXMuestreo;
    }

    public Integer getIdTarea() {
        return IdTarea;
    }

    public void setIdTarea(Integer idTarea) {
        IdTarea = idTarea;
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

    public String getFechaHora() {
        return FechaHora;
    }

    public void setFechaHora(String fechaHora) {
        FechaHora = fechaHora;
    }

    public Integer getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        Temperatura = temperatura;
    }

    public Integer getHumedad() {
        return Humedad;
    }

    public void setHumedad(Integer humedad) {
        Humedad = humedad;
    }
}

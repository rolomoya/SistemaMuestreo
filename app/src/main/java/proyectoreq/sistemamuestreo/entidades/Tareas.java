package proyectoreq.sistemamuestreo.entidades;

import java.io.Serializable;

public class Tareas implements Serializable {
    private Integer idTarea;
    private String nombre;
    private String tipo;

    public Tareas(Integer idTarea, String nombre, String tipo) {
        this.idTarea = idTarea;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Integer getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(Integer idTarea) {
        this.idTarea = idTarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

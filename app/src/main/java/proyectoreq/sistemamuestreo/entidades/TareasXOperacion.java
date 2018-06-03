package proyectoreq.sistemamuestreo.entidades;

public class TareasXOperacion {
    private Integer IdTareaXOperacion;
    private Integer IdTarea;
    private Integer IdOperacion;

    public TareasXOperacion(Integer idTareaXOperacion, Integer idTarea, Integer idOperacion) {
        IdTareaXOperacion = idTareaXOperacion;
        IdTarea = idTarea;
        IdOperacion = idOperacion;
    }

    public Integer getIdTareaXOperacion() {
        return IdTareaXOperacion;
    }

    public void setIdTareaXOperacion(Integer idTareaXOperacion) {
        IdTareaXOperacion = idTareaXOperacion;
    }

    public Integer getIdTarea() {
        return IdTarea;
    }

    public void setIdTarea(Integer idTarea) {
        IdTarea = idTarea;
    }

    public Integer getIdOperacion() {
        return IdOperacion;
    }

    public void setIdOperacion(Integer idOperacion) {
        IdOperacion = idOperacion;
    }
}

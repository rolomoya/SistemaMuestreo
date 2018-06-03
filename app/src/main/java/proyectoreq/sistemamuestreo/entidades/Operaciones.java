package proyectoreq.sistemamuestreo.entidades;

public class Operaciones {
    private Integer idOperacion;
    private String nombre;
    private String descripcion;

    public Operaciones(Integer idOperacion, String nombre, String descripcion) {
        this.idOperacion = idOperacion;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(Integer idOperacion) {
        this.idOperacion = idOperacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

package proyectoreq.sistemamuestreo.entidades;

public class UsuarioXMuestreo {
    private Integer IdUsuarioXMuestreo;
    private Integer IdUsuario;
    private Integer IdMuestreo;

    public UsuarioXMuestreo(Integer idUsuarioXMuestreo, Integer idUsuario, Integer idMuestreo) {
        IdUsuarioXMuestreo = idUsuarioXMuestreo;
        IdUsuario = idUsuario;
        IdMuestreo = idMuestreo;
    }

    public Integer getIdUsuarioXMuestreo() {
        return IdUsuarioXMuestreo;
    }

    public void setIdUsuarioXMuestreo(Integer idUsuarioXMuestreo) {
        IdUsuarioXMuestreo = idUsuarioXMuestreo;
    }

    public Integer getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        IdUsuario = idUsuario;
    }

    public Integer getIdMuestreo() {
        return IdMuestreo;
    }

    public void setIdMuestreo(Integer idMuestreo) {
        IdMuestreo = idMuestreo;
    }
}

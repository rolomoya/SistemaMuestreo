package App;

public class Usuario {

    private String nombre;
    private String contrasena;
    private String nom_completo;

    public Usuario() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNom_completo() {
        return nom_completo;
    }

    public void setNom_completo(String nom_completo) {
        this.nom_completo = nom_completo;
    }
}

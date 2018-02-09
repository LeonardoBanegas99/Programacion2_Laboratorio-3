package lab.pkg3_leonardo_samuel;

public class Administrador extends Personas{
    private String usuario;
    private String contrasena;

    public Administrador() {
        super();
    }

    public Administrador(String usuario, String contrasena, String identidad, String correo) {
        super(identidad, correo);
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Administrador{" + "usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }
    
    
    
}

package lab.pkg3_leonardo_samuel;

public class Personas {
    private String identidad;
    private String correo;

    public Personas() {
    }

    public Personas(String identidad, String correo) {
        this.identidad = identidad;
        this.correo = correo;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Personas{" + "identidad=" + identidad + ", correo=" + correo + '}';
    }
    
    
    
}

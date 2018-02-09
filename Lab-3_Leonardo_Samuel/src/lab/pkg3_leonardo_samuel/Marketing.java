
package lab.pkg3_leonardo_samuel;

import java.util.ArrayList;

public class Marketing extends Freelance {
    private ArrayList<ProyectoComercial> Pcomercial = new ArrayList();
    private String redsocial;

    public Marketing() {
        super();
    }

    public Marketing(String redsocial, String nombre, String contrasena, String genero, int edad, int dinero, String ciudad, String telefono, String identidad, String correo) {
        super(nombre, contrasena, genero, edad, dinero, ciudad, telefono, identidad, correo);
        this.redsocial = redsocial;
    }

    public ArrayList<ProyectoComercial> getPcomercial() {
        return Pcomercial;
    }

    public void setPcomercial(ArrayList<ProyectoComercial> Pcomercial) {
        this.Pcomercial = Pcomercial;
    }

    public String getRedsocial() {
        return redsocial;
    }

    public void setRedsocial(String redsocial) {
        this.redsocial = redsocial;
    }

    @Override
    public String toString() {
        return "Marketing{" + "Pcomercial=" + Pcomercial + ", redsocial=" + redsocial + '}';
    }
    
    
    
}

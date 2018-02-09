
package lab.pkg3_leonardo_samuel;

import java.util.ArrayList;

public class Contador extends Freelance {
    private ArrayList<ProyectoComercial> contador = new ArrayList();
    private String universidad;
    private boolean estadodeinscripcion;
    private String hobbies;

    public Contador() {
        super();
    }

    public Contador(String universidad, boolean estadodeinscripcion, String hobbies, String nombre, String contrasena, String genero, int edad, int dinero, String ciudad, String telefono, String identidad, String correo) {
        super(nombre, contrasena, genero, edad, dinero, ciudad, telefono, identidad, correo);
        this.universidad = universidad;
        this.estadodeinscripcion = estadodeinscripcion;
        this.hobbies = hobbies;
    }

    public ArrayList<ProyectoComercial> getContador() {
        return contador;
    }

    public void setContador(ArrayList<ProyectoComercial> contador) {
        this.contador = contador;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public boolean getEstadodeinscripcion() {
        return estadodeinscripcion;
    }

    public void setEstadodeinscripcion(boolean estadodeinscripcion) {
        this.estadodeinscripcion = estadodeinscripcion;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Contador{" + "contador=" + contador + ", universidad=" + universidad + ", estadodeinscripcion=" + estadodeinscripcion + ", hobbies=" + hobbies + '}';
    }
    
    
    
}

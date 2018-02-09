package lab.pkg3_leonardo_samuel;

import java.util.ArrayList;

public class DisenadorGrafico extends Freelance {
    private ArrayList<ProyectoPublicitario> Ppublicitario= new ArrayList();
    private String universidad;
    private String hobbies;

    public DisenadorGrafico() {
        super();
    }

    public DisenadorGrafico(String universidad, String hobbies, String nombre, String contrasena, String genero, int edad, int dinero, String ciudad, String telefono, String identidad, String correo) {
        super(nombre, contrasena, genero, edad, dinero, ciudad, telefono, identidad, correo);
        this.universidad = universidad;
        this.hobbies = hobbies;
    }

    public ArrayList<ProyectoPublicitario> getPpublicitario() {
        return Ppublicitario;
    }

    public void setPpublicitario(ArrayList<ProyectoPublicitario> Ppublicitario) {
        this.Ppublicitario = Ppublicitario;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "DisenadorGrafico{" + "Ppublicitario=" + Ppublicitario + ", universidad=" + universidad + ", hobbies=" + hobbies + '}';
    }
    
    

    
    
    
}

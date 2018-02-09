package lab.pkg3_leonardo_samuel;

import java.util.ArrayList;

public class MediosAudiovisuales extends Freelance{
    private ArrayList<ProyectoPublicitario> Maudiovisuales = new ArrayList();
    private String nombredemarca;
    private String modelodecamaradevideo;

    public MediosAudiovisuales() {
        super();
    }

    public MediosAudiovisuales(String nombredemarca, String modelodecamaradevideo, String nombre, String contrasena, String genero, int edad, int dinero, String ciudad, String telefono, String identidad, String correo) {
        super(nombre, contrasena, genero, edad, dinero, ciudad, telefono, identidad, correo);
        this.nombredemarca = nombredemarca;
        this.modelodecamaradevideo = modelodecamaradevideo;
    }

    public ArrayList<ProyectoPublicitario> getMaudiovisuales() {
        return Maudiovisuales;
    }

    public void setMaudiovisuales(ArrayList<ProyectoPublicitario> Maudiovisuales) {
        this.Maudiovisuales = Maudiovisuales;
    }

    public String getNombredemarca() {
        return nombredemarca;
    }

    public void setNombredemarca(String nombredemarca) {
        this.nombredemarca = nombredemarca;
    }

    public String getModelodecamaradevideo() {
        return modelodecamaradevideo;
    }

    public void setModelodecamaradevideo(String modelodecamaradevideo) {
        this.modelodecamaradevideo = modelodecamaradevideo;
    }

    @Override
    public String toString() {
        return "MediosAudiovisuales{" + "Maudiovisuales=" + Maudiovisuales + ", nombredemarca=" + nombredemarca + ", modelodecamaradevideo=" + modelodecamaradevideo + '}';
    }
    
    
    

    
}

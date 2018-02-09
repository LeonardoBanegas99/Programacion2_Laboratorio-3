package lab.pkg3_leonardo_samuel;

import java.util.ArrayList;

public class Fotografo extends Freelance {
    private ArrayList<ProyectoPublicitario> fotografo= new ArrayList();
    private String nombredemarca;
    private String modelodecamaradefoto;

    public Fotografo() {
        super();
    }

    public Fotografo(String nombredemarca, String modelodecamaradefoto, String nombre, String contrasena, String genero, int edad, int dinero, String ciudad, String telefono, String identidad, String correo) {
        super(nombre, contrasena, genero, edad, dinero, ciudad, telefono, identidad, correo);
        this.nombredemarca = nombredemarca;
        this.modelodecamaradefoto = modelodecamaradefoto;
    }

    public ArrayList<ProyectoPublicitario> getFotografo() {
        return fotografo;
    }

    public void setFotografo(ArrayList<ProyectoPublicitario> fotografo) {
        this.fotografo = fotografo;
    }

    public String getNombredemarca() {
        return nombredemarca;
    }

    public void setNombredemarca(String nombredemarca) {
        this.nombredemarca = nombredemarca;
    }

    public String getModelodecamaradefoto() {
        return modelodecamaradefoto;
    }

    public void setModelodecamaradefoto(String modelodecamaradefoto) {
        this.modelodecamaradefoto = modelodecamaradefoto;
    }

    @Override
    public String toString() {
        return "Fotografo{" + "fotografo=" + fotografo + ", nombredemarca=" + nombredemarca + ", modelodecamaradefoto=" + modelodecamaradefoto + '}';
    }
    
    
    
    
    
    
}

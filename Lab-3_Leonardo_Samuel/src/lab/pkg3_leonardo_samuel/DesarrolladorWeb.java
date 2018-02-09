package lab.pkg3_leonardo_samuel;

import java.util.ArrayList;

public class DesarrolladorWeb extends Freelance {
    private String lenguajeprogra;
    private String universidad;
    private String idioma;
    private ArrayList<ProyectoWeb> web = new ArrayList();

    public DesarrolladorWeb() {
        super();
    }

    public DesarrolladorWeb(String lenguajeprogra, String universidad, String idioma, String nombre, String contrasena, String genero, int edad, int dinero, String ciudad, String telefono, String identidad, String correo) {
        super(nombre, contrasena, genero, edad, dinero, ciudad, telefono, identidad, correo);
        this.lenguajeprogra = lenguajeprogra;
        this.universidad = universidad;
        this.idioma = idioma;
    }

    public String getLenguajeprogra() {
        return lenguajeprogra;
    }

    public void setLenguajeprogra(String lenguajeprogra) {
        this.lenguajeprogra = lenguajeprogra;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public ArrayList<ProyectoWeb> getWeb() {
        return web;
    }

    public void setWeb(ArrayList<ProyectoWeb> web) {
        this.web = web;
    }

    @Override
    public String toString() {
        return "DesarrolladorWeb{" + "lenguajeprogra=" + lenguajeprogra + ", universidad=" + universidad + ", idioma=" + idioma + ", web=" + web + '}';
    }
    
    
}

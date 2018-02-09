package lab.pkg3_leonardo_samuel;

import java.util.ArrayList;

public class Empresa {

    private String nombre;
    private String telefono;
    private ArrayList<Proyecto> proyectos = new ArrayList();
    private String correo;
    private String contra;
    private String descripcion;

    public Empresa() {
    }

    public Empresa(String nombre, String telefono, String correo, String contra, String descripcion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.contra = contra;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", telefono=" + telefono + ", proyectos=" + proyectos + ", correo=" + correo + ", contra=" + contra + ", descripcion=" + descripcion + '}';
    }

}

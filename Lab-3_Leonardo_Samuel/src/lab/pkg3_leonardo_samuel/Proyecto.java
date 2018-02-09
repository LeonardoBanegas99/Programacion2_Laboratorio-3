package lab.pkg3_leonardo_samuel;

import java.util.Date;

public class Proyecto {

    private String nombre;
    private Empresa emp;
    private int precio;
    private boolean estado;
    private String descripcion;
    private Date fechainicio;
    private Date fechaentrega;

    public Proyecto(String nombre, Empresa emp, int precio, boolean estado, String descripcion, Date fechainicio, Date fechaentrega) {
        this.nombre = nombre;
        this.emp = emp;
        this.precio = precio;
        this.estado = estado;
        this.descripcion = descripcion;
        this.fechainicio = fechainicio;
        this.fechaentrega = fechaentrega;
    }

    public Proyecto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empresa getEmp() {
        return emp;
    }

    public void setEmp(Empresa emp) {
        this.emp = emp;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(Date fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", emp=" + emp + ", precio=" + precio + ", estado=" + estado + ", descripcion=" + descripcion + ", fechainicio=" + fechainicio + ", fechaentrega=" + fechaentrega + '}';
    }
    
    

}

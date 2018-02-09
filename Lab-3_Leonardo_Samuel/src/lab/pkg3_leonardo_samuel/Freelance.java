/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_leonardo_samuel;

import java.util.ArrayList;

/**
 *
 * @author Samuel
 */
public class Freelance extends Personas{
    private String nombre;
    private String contrasena;
    private String genero;
    private int edad;
    private ArrayList<Empresa> empresas= new ArrayList();
    private int dinero;
    private String ciudad;
    private String telefono;

    public Freelance() {
        super();
    }

    public Freelance(String nombre, String contrasena, String genero, int edad, int dinero, String ciudad, String telefono, String identidad, String correo) {
        super(identidad, correo);
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.genero = genero;
        this.edad = edad;
        this.dinero = dinero;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Freelance{" + "nombre=" + nombre + ", contrasena=" + contrasena + ", genero=" + genero + ", edad=" + edad + ", empresas=" + empresas + ", dinero=" + dinero + ", ciudad=" + ciudad + ", telefono=" + telefono + '}';
    }

    
    
    
    
}

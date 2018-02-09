package lab.pkg3_leonardo_samuel;

import java.util.ArrayList;

public class ConnectiveLine {

    private ArrayList<Empresa> empresas = new ArrayList();
    private ArrayList<Personas> personas = new ArrayList();
    private ArrayList<Ingreso> ingresos = new ArrayList();

    public ConnectiveLine() {
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }

    public ArrayList<Personas> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Personas> personas) {
        this.personas = personas;
    }

    public ArrayList<Ingreso> getIngresos() {
        return ingresos;
    }

    public void setIngresos(ArrayList<Ingreso> ingresos) {
        this.ingresos = ingresos;
    }

    @Override
    public String toString() {
        return "ConnectiveLine{" + "empresas=" + empresas + ", personas=" + personas + ", ingresos=" + ingresos + '}';
    }
    
    
    
}

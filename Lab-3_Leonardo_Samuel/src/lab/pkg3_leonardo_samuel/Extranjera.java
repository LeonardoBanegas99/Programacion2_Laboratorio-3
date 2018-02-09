package lab.pkg3_leonardo_samuel;

public class Extranjera extends Empresa{
    private String pais;
    private String ciudad;
    private String url;

    public Extranjera() {
    }

    public Extranjera(String pais, String ciudad, String url, String nombre, String telefono, String correo, String contra, String descripcion) {
        super(nombre, telefono, correo, contra, descripcion);
        this.pais = pais;
        this.ciudad = ciudad;
        this.url = url;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Extranjera{" + "pais=" + pais + ", ciudad=" + ciudad + ", url=" + url + '}';
    }
    
    
    
}

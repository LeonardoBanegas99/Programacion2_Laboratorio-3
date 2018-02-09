package lab.pkg3_leonardo_samuel;

import java.util.Scanner;

public class Lab3_Leonardo_Samuel {

    private Scanner sc = new Scanner(System.in);
    private ConnectiveLine Cline;

    public static void main(String[] args) {
        System.out.println("m");
        System.out.println("a");

    }

    private void logIn() {
        System.out.println("Ingrese su correo: ");
        String correo = sc.next();
        System.out.println("Ingrese su contraseña: ");
        String contra = sc.next();
        for (int i = 0; i < Cline.getEmpresas().size(); i++) {
            if ((Cline.getEmpresas().get(i).getCorreo().equals(correo)) && (Cline.getEmpresas().get(i).getContra().equals(contra))) {
                logInEmpresas();
            }
        }
        for (int i = 0; i < Cline.getPersonas().size(); i++) {
            if ((Cline.getPersonas().get(i).getCorreo().equals(correo))) {
                if (((Administrador) Cline.getPersonas().get(i)).getContrasena().equals(contra)) {
                    logInAdministrador();
                }
                if (((Freelance) Cline.getPersonas().get(i)).getContrasena().equals(contra)) {
                    logInFreelance();
                }
            }
        }

    }

    private void logInEmpresas() {

    }

    private void logInAdministrador() {

    }

    private void logInFreelance() {

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void registrarpersona(){
        System.out.println("Ingrese el numero de identidad: ");
        String identidad = sc.next();
        System.out.println("Ingrese el correo: ");
        String correo = sc.next();
        Cline.getPersonas().add(new Personas(identidad, correo));
        System.out.println(""
                + "1-Administrador\n"
                + "2-Freelance\n"
                + "Ingrese hacia donde desea ir: ");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Ingrese el nombre de usuario: ");
                String usuario = sc.next();
                System.out.println("Ingrese la contrasena: ");
                String contrasena = sc.next();
                Cline.getPersonas().add(new Administrador(usuario, contrasena, identidad, correo));
                break;
            case 2:
                System.out.println("Ingrese el nombre: ");
                String nombre = sc.next();
                System.out.println("Ingrese la contrasena: ");
                String contrasena1 = sc.next();
                System.out.println("Ingrese el genero: ");
                String genero = sc.next();
                System.out.println("Ingrese el dinero: ");
                int dinero = sc.nextInt();
                System.out.println("Ingrese la edad: ");
                int edad = sc.nextInt();
                System.out.println("Ingrese la ciudad: ");
                String ciudad = sc.next();
                System.out.println("Ingrese el telefono: ");
                String telefono = sc.next();
                Cline.getPersonas().add(new Freelance( nombre,  contrasena1,  genero,  edad,  dinero,  ciudad,  telefono, identidad, correo));
                System.out.println(""
                        + "1. Desarrollador Web\n"
                        + "2. Fotografo\n"
                        + "3. Medios Audiovisuales\n"
                        + "4. Disenador Grafico\n"
                        + "5. Marketing\n"
                        + "6. Contador\n"
                        + "Ingrese que desea registrar: ");
                int opci= sc.nextInt();
                switch (opci){
                    case 1:
                        System.out.println("Ingrese el lenguaje de programacion: ");
                        String lenguajeprogra = sc.next();
                        System.out.println("Ingrese la universidad: ");
                        String universidad = sc.next();
                        System.out.println("Ingrese el idioma: ");
                        String idioma = sc.next();
                        Cline.getPersonas().add(new DesarrolladorWeb(lenguajeprogra, universidad, idioma, nombre, contrasena1, genero, edad, dinero, ciudad, telefono, identidad, correo));
                        break;
                    case 2:
                        System.out.println("Ingrese el nombre de la marca: ");
                        String nombredemarca = sc.next();
                        System.out.println("Ingrese el modelo de la camara: ");
                        String modelocamaradefoto = sc.next();
                        Cline.getPersonas().add(new Fotografo(nombredemarca, modelocamaradefoto, nombre, contrasena1, genero, edad, dinero, ciudad, telefono, identidad, correo));
                        break;
                    case 3:
                        System.out.println("Ingrese la marca: ");
                        String nombredemarca1 = sc.next();
                        System.out.println("Ingrese el modelo de camara de video: ");
                        String modelodecamaradevideo = sc.next();
                        Cline.getPersonas().add(new MediosAudiovisuales(nombredemarca1, modelodecamaradevideo, nombre, contrasena1, genero, edad, dinero, ciudad, telefono, identidad, correo));
                        break;
                    case 4:
                        System.out.println("Ingrese la universidad: ");
                        String universidad1 = sc.next();
                        System.out.println("Ingrese su hobbie: ");
                        String hobbies = sc.next();
                        Cline.getPersonas().add(new DisenadorGrafico( universidad1, hobbies, nombre, contrasena1, genero, edad, dinero, ciudad, telefono, identidad, correo));
                        break;
                    case 5:
                        System.out.println("Ingrese la red social: ");
                        String redsocial = sc.next();
                        Cline.getPersonas().add(new Marketing(redsocial, nombre, contrasena1, genero, edad, dinero, ciudad, telefono, identidad, correo));
                        break;
                    case 6:
                        System.out.println("Ingrese el universidad: ");
                        String universidad2 = sc.next();
                        System.out.println("Ingrese el estado de inscripcion: ");
                        String estadodeinscripcion = sc.next();
                        System.out.println("Ingrese el hobbie: ");
                        String hobbies1 = sc.next();
                        Cline.getPersonas().add(new Contador(universidad2, estadodeinscripcion, hobbies1, nombre, contrasena1, genero, edad, dinero, ciudad, telefono, identidad, correo));
                        break;
                }
                break;
        }
    }
    public void agregarrempresa(){
        System.out.println("Ingrese el nombre: ");
        String nombre1 = sc.next();
        System.out.println("Ingrese el telefono: ");
        String telefono1 = sc.next();
        System.out.println("Ingrese el correo: ");
        String correo1 = sc.next();
        System.out.println("Ingrese la contrasena: ");
        String contrasena2 = sc.next();
        System.out.println("Ingrese la descripcion: ");
        String descripcion = sc.next();
        Cline.getEmpresas().add(new Empresa(nombre1, telefono1, correo1, contrasena2, descripcion));
        System.out.println("1.Extranjeras \n"
                + "2.Nacionales\n"
                + "Ingrese que desea agregar: ");
        int opci1 = sc.nextInt();
        switch (opci1) {
            case 1:
                System.out.println("Ingrese el pais: ");
                String pais = sc.next();
                System.out.println("Ingrese la ciudad: ");
                String ciudad1 = sc.next();
                System.out.println("Ingrese el URL: ");
                String url = sc.next();
                Cline.getEmpresas().add(new Extranjera(pais, ciudad1, url, nombre1, telefono1, correo1, contrasena2, descripcion));
                break;
            case 2:
                System.out.println("Ingrese el departamento: ");
                String departamento = sc.next();
                System.out.println("Ingrese el municipio: ");
                String municipio = sc.next();
                System.out.println("Ingrese la ciudad: ");
                String ciudad2 = sc.next();
                System.out.println("Ingrese la mision: ");
                String mision = sc.next();
                System.out.println("Ingrese la vision: ");
                String vision = sc.next();
                Cline.getEmpresas().add(new Nacional(departamento, municipio, ciudad2, mision, vision, nombre1, telefono1, correo1, contrasena2, descripcion));

                break;
        }

    }

}

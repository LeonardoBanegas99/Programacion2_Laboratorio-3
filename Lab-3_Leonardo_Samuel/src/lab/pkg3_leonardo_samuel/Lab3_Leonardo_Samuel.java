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
                Empresa ad = ((Empresa) Cline.getEmpresas().get(i));
                int pos = i;
                logInEmpresas(ad, i);
                break;
            }
        }
        for (int i = 0; i < Cline.getPersonas().size(); i++) {
            if ((Cline.getPersonas().get(i).getCorreo().equals(correo))) {
                if (((Administrador) Cline.getPersonas().get(i)).getContrasena().equals(contra)) {
                    Administrador ad = ((Administrador) Cline.getPersonas().get(i));
                    int pos = i;
                    logInAdministrador(ad, pos);
                    break;
                }
                if (((Freelance) Cline.getPersonas().get(i)).getContrasena().equals(contra)) {
                    Freelance fl = ((Freelance) Cline.getPersonas().get(i));
                    int pos = i;
                    logInFreelance(fl, pos);
                    break;
                }
            }
        }

    }
//yaaaaaaaaaaaaaaaaaa

    private void logInEmpresas(Empresa ad, int pos) {
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println("1) Modificar\n"
                    + "2) Eliminar Empresas\n");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    if (ad instanceof Extranjera) {
                        System.out.println("Ingrese nuevo nombre: ");
                        Cline.getEmpresas().get(pos).setNombre(sc.next());
                        System.out.println("Ingrese nuevo telefono: ");
                        Cline.getEmpresas().get(pos).setTelefono(sc.next());
                        System.out.println("Ingrese nuevo correo: ");
                        Cline.getEmpresas().get(pos).setCorreo(sc.next());
                        System.out.println("Ingrese nueva contraseña: ");
                        Cline.getEmpresas().get(pos).setContra(sc.next());
                        System.out.println("Ingrese nueva descripcion: ");
                        Cline.getEmpresas().get(pos).setDescripcion(sc.next());
                        System.out.println("Ingrese nuevo pais: ");
                        ((Extranjera) (Cline.getEmpresas().get(pos))).setPais(sc.next());
                        System.out.println("Ingrese nueva ciudad: ");
                        ((Extranjera) (Cline.getEmpresas().get(pos))).setCiudad(sc.next());
                        System.out.println("Ingrese nuevo url: ");
                        ((Extranjera) (Cline.getEmpresas().get(pos))).setUrl(sc.next());
                        System.out.println("--Exito--");
                    }
                    if (ad instanceof Nacional) {
                        System.out.println("Ingrese nuevo nombre: ");
                        Cline.getEmpresas().get(pos).setNombre(sc.next());
                        System.out.println("Ingrese nuevo telefono: ");
                        Cline.getEmpresas().get(pos).setTelefono(sc.next());
                        System.out.println("Ingrese nuevo correo: ");
                        Cline.getEmpresas().get(pos).setCorreo(sc.next());
                        System.out.println("Ingrese nueva contraseña: ");
                        Cline.getEmpresas().get(pos).setContra(sc.next());
                        System.out.println("Ingrese nueva descripcion: ");
                        Cline.getEmpresas().get(pos).setDescripcion(sc.next());
                        System.out.println("Ingrese nuevo departamento: ");
                        ((Nacional) (Cline.getEmpresas().get(pos))).setDepartamento(sc.next());
                        System.out.println("Ingrese nuevo municipio: ");
                        ((Nacional) (Cline.getEmpresas().get(pos))).setMunicipio(sc.next());
                        System.out.println("Ingrese nuevo ciudad: ");
                        ((Nacional) (Cline.getEmpresas().get(pos))).setCiudad(sc.next());
                        System.out.println("Ingrese nuevo mision: ");
                        ((Nacional) (Cline.getEmpresas().get(pos))).setMision(sc.next());
                        System.out.println("Ingrese nueva vision: ");
                        ((Nacional) (Cline.getEmpresas().get(pos))).setVision(sc.next());
                        System.out.println("--Exito--");
                    }
                    break;
                case 2:
                    System.out.println("---Empresas---");
                    int cont = 0;
                    for (Empresa e : Cline.getEmpresas()) {
                        System.out.println(cont + ")  " + e);
                        cont++;
                    }
                    System.out.println("Seleccione empresa a eliminar: ");
                    int selec = sc.nextInt() - 1;
                    System.out.println("Ingrese su correo: ");
                    String correo = sc.next();
                    System.out.println("Ingrese su contraseña: ");
                    String contra = sc.next();
                    for (int i = 0; i < Cline.getEmpresas().size(); i++) {
                        if ((Cline.getEmpresas().get(i).getCorreo().equals(correo)) && (Cline.getEmpresas().get(i).getContra().equals(contra))) {
                            Cline.getEmpresas().remove(selec);
                            System.out.println("Eliminado con Exito");
                        }
                    }
                    break;
                default:
                    System.out.println("ERROR!!");
            }
            System.out.println("Continua{s/n}: ");
            resp = sc.next().charAt(0);
        }
    }

    private void logInAdministrador(Administrador ad, int pos) {
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println("1) Modificar\n"
                    + "2) Visualizar Ingresos\n"
                    + "3) Eliminar Administradores\n");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nuevo correo: ");
                    Cline.getPersonas().get(pos).setCorreo(sc.next());
                    System.out.println("Ingrese nueva identidad: ");
                    Cline.getPersonas().get(pos).setIdentidad(sc.next());
                    System.out.println("Ingrese nuevo nombre de usuario: ");
                    ((Administrador) Cline.getPersonas().get(pos)).setUsuario(sc.next());
                    System.out.println("Ingrese nueva contraseña: ");
                    ((Administrador) Cline.getPersonas().get(pos)).setContrasena(sc.next());
                    break;
                case 2:
                    System.out.println("---Ingresos---");
                    int cont = 1;
                    for (Ingreso in : Cline.getIngresos()) {
                        System.out.println(cont + ")  " + in);
                        cont++;
                    }
                    break;
                case 3:
                    System.out.println("---Administradores---");
                    int cont2 = 1;
                    for (Personas p : Cline.getPersonas()) {
                        System.out.println(cont2 + ")  " + p.getCorreo());
                        cont2++;
                    }
                    System.out.println("Seleccione administrador a eliminar: ");
                    int selec = sc.nextInt() - 1;
                    System.out.println("Ingrese su correo: ");
                    String correo = sc.next();
                    System.out.println("Ingrese su contraseña: ");
                    String contra = sc.next();
                    if (Cline.getPersonas().get(selec) instanceof Administrador) {
                        for (int i = 0; i < Cline.getPersonas().size(); i++) {
                            if ((Cline.getPersonas().get(i).getCorreo().equals(correo))) {
                                if (ad.getContrasena().equals(contra)) {
                                    Cline.getPersonas().remove(selec);
                                    System.out.println("Eliminado con Exito");
                                }
                            }
                        }
                        break;

                    } else {
                        System.out.println("Persona invalida / es un freelance no un administrador.");
                    }
                default:
                    System.out.println("ERROR!!");
            }
            System.out.println("Continua{s/n}: ");
            resp = sc.next().charAt(0);
        }
    }

    private void logInFreelance(Freelance fl, int pos) {
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println("1) Modificar Freelance\n"
                    + "2) Eliminar Freelance\n"
                    + "3) \n");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    if (fl instanceof Fotografo) {
                        System.out.println("Ingrese nuevo correo: ");
                        Cline.getPersonas().get(pos).setCorreo(sc.next());
                        System.out.println("Ingrese nueva identidad: ");
                        Cline.getPersonas().get(pos).setIdentidad(sc.next());
                        System.out.println("Ingrese nuevo nombre: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setNombre(sc.next());
                        System.out.println("Ingrese nueva contraseña: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setContrasena(sc.next());
                        System.out.println("Ingrese nuevo genero: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setGenero(sc.next());
                        System.out.println("Ingrese nueva edad: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setEdad(sc.nextInt());
                        System.out.println("Ingrese nueva cantidad de dinero: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setDinero(sc.nextInt());
                        System.out.println("Ingrese nueva ciudad: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setCiudad(sc.next());
                        System.out.println("Ingrese nuevo telefono: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setTelefono(sc.next());
                        /*variables propias*/
                        System.out.println("Ingrese nueva marca: ");
                        ((Fotografo) ((Freelance) Cline.getPersonas().get(pos))).setNombredemarca(sc.next());
                        System.out.println("Ingrese nuevo modelo de camara fotografica: ");
                        ((Fotografo) ((Freelance) Cline.getPersonas().get(pos))).setModelodecamaradefoto(sc.next());

                    }
                    if (fl instanceof DesarrolladorWeb) {
                        System.out.println("Ingrese nuevo correo: ");
                        Cline.getPersonas().get(pos).setCorreo(sc.next());
                        System.out.println("Ingrese nueva identidad: ");
                        Cline.getPersonas().get(pos).setIdentidad(sc.next());
                        System.out.println("Ingrese nuevo nombre: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setNombre(sc.next());
                        System.out.println("Ingrese nueva contraseña: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setContrasena(sc.next());
                        System.out.println("Ingrese nuevo genero: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setGenero(sc.next());
                        System.out.println("Ingrese nueva edad: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setEdad(sc.nextInt());
                        System.out.println("Ingrese nueva cantidad de dinero: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setDinero(sc.nextInt());
                        System.out.println("Ingrese nueva ciudad: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setCiudad(sc.next());
                        System.out.println("Ingrese nuevo telefono: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setTelefono(sc.next());
                        /*variables propias*/
                        System.out.println("Ingrese nuevo lenguaje de programacion: ");
                        ((DesarrolladorWeb) ((Freelance) Cline.getPersonas().get(pos))).setLenguajeprogra(sc.next());
                        System.out.println("Ingrese nueva universidad: ");
                        ((DesarrolladorWeb) ((Freelance) Cline.getPersonas().get(pos))).setUniversidad(sc.next());
                        System.out.println("Ingrese nuevo idioma: ");
                        ((DesarrolladorWeb) ((Freelance) Cline.getPersonas().get(pos))).setIdioma(sc.next());
                    }
                    if (fl instanceof MediosAudiovisuales) {
                        System.out.println("Ingrese nuevo correo: ");
                        Cline.getPersonas().get(pos).setCorreo(sc.next());
                        System.out.println("Ingrese nueva identidad: ");
                        Cline.getPersonas().get(pos).setIdentidad(sc.next());
                        System.out.println("Ingrese nuevo nombre: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setNombre(sc.next());
                        System.out.println("Ingrese nueva contraseña: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setContrasena(sc.next());
                        System.out.println("Ingrese nuevo genero: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setGenero(sc.next());
                        System.out.println("Ingrese nueva edad: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setEdad(sc.nextInt());
                        System.out.println("Ingrese nueva cantidad de dinero: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setDinero(sc.nextInt());
                        System.out.println("Ingrese nueva ciudad: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setCiudad(sc.next());
                        System.out.println("Ingrese nuevo telefono: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setTelefono(sc.next());
                        /*variables propias*/
                        System.out.println("Ingrese nueva marca: ");
                        ((MediosAudiovisuales) ((Freelance) Cline.getPersonas().get(pos))).setNombredemarca(sc.next());
                        System.out.println("Ingrese nuevo modelo de camara fotografica: ");
                        ((MediosAudiovisuales) ((Freelance) Cline.getPersonas().get(pos))).setModelodecamaradevideo(sc.next());
                    }
                    if (fl instanceof DisenadorGrafico) {
                        System.out.println("Ingrese nuevo correo: ");
                        Cline.getPersonas().get(pos).setCorreo(sc.next());
                        System.out.println("Ingrese nueva identidad: ");
                        Cline.getPersonas().get(pos).setIdentidad(sc.next());
                        System.out.println("Ingrese nuevo nombre: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setNombre(sc.next());
                        System.out.println("Ingrese nueva contraseña: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setContrasena(sc.next());
                        System.out.println("Ingrese nuevo genero: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setGenero(sc.next());
                        System.out.println("Ingrese nueva edad: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setEdad(sc.nextInt());
                        System.out.println("Ingrese nueva cantidad de dinero: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setDinero(sc.nextInt());
                        System.out.println("Ingrese nueva ciudad: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setCiudad(sc.next());
                        System.out.println("Ingrese nuevo telefono: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setTelefono(sc.next());
                        /*variables propias*/
                        System.out.println("Ingrese nueva universidad: ");
                        ((DisenadorGrafico) ((Freelance) Cline.getPersonas().get(pos))).setUniversidad(sc.next());
                        System.out.println("Ingrese nuevo hobbie: ");
                        ((DisenadorGrafico) ((Freelance) Cline.getPersonas().get(pos))).setHobbies(sc.next());
                    }
                    if (fl instanceof Marketing) {
                        System.out.println("Ingrese nuevo correo: ");
                        Cline.getPersonas().get(pos).setCorreo(sc.next());
                        System.out.println("Ingrese nueva identidad: ");
                        Cline.getPersonas().get(pos).setIdentidad(sc.next());
                        System.out.println("Ingrese nuevo nombre: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setNombre(sc.next());
                        System.out.println("Ingrese nueva contraseña: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setContrasena(sc.next());
                        System.out.println("Ingrese nuevo genero: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setGenero(sc.next());
                        System.out.println("Ingrese nueva edad: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setEdad(sc.nextInt());
                        System.out.println("Ingrese nueva cantidad de dinero: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setDinero(sc.nextInt());
                        System.out.println("Ingrese nueva ciudad: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setCiudad(sc.next());
                        System.out.println("Ingrese nuevo telefono: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setTelefono(sc.next());
                        /*variables propias*/
                        System.out.println("Ingrese nueva red social: ");
                        ((Marketing) ((Freelance) Cline.getPersonas().get(pos))).setRedsocial(sc.next());
                    }
                    if (fl instanceof Contador) {
                        System.out.println("Ingrese nuevo correo: ");
                        Cline.getPersonas().get(pos).setCorreo(sc.next());
                        System.out.println("Ingrese nueva identidad: ");
                        Cline.getPersonas().get(pos).setIdentidad(sc.next());
                        System.out.println("Ingrese nuevo nombre: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setNombre(sc.next());
                        System.out.println("Ingrese nueva contraseña: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setContrasena(sc.next());
                        System.out.println("Ingrese nuevo genero: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setGenero(sc.next());
                        System.out.println("Ingrese nueva edad: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setEdad(sc.nextInt());
                        System.out.println("Ingrese nueva cantidad de dinero: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setDinero(sc.nextInt());
                        System.out.println("Ingrese nueva ciudad: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setCiudad(sc.next());
                        System.out.println("Ingrese nuevo telefono: ");
                        ((Freelance) Cline.getPersonas().get(pos)).setTelefono(sc.next());
                        /*variables propias*/
                        System.out.println("Ingrese nueva universidad: ");
                        ((Contador) ((Freelance) Cline.getPersonas().get(pos))).setUniversidad(sc.next());
                        System.out.println("Ingrese nueva estado de inscripcion: ");
                        System.out.println("1) True");
                        System.out.println("2) False");
                        boolean tipo = true;
                        int op = sc.nextInt();
                        if (op == 1) {
                            tipo = true;
                        } else if (op == 2) {
                            tipo = false;
                        } else {
                            while (op < 1 || op > 2) {
                                System.out.println("ERROR");
                                System.out.println("Ingrese categoria: ");
                                System.out.println("1) True");
                                System.out.println("2) False");
                                op = sc.nextInt();
                                if (op == 1) {
                                    tipo = true;
                                } else if (op == 2) {
                                    tipo = false;
                                }
                            }
                        }
                        ((Contador) ((Freelance) Cline.getPersonas().get(pos))).setEstadodeinscripcion(tipo);
                        System.out.println("Ingrese nuevo hobbie: ");
                        ((Contador) ((Freelance) Cline.getPersonas().get(pos))).setHobbies(sc.next());
                    }
                    break;
                case 2:
                    System.out.println("---Freelances---");
                    for (int i = 0; i < Cline.getPersonas().size(); i++) {
                        if (Cline.getPersonas().get(i) instanceof Freelance) {
                            System.out.println(i + ") " + Cline.getPersonas().get(i).getCorreo());
                        }
                    }
                    System.out.println("Seleccione posicion: ");
                    int pos2 = sc.nextInt();
                    System.out.println("Ingrese su correo: ");
                    String correo = sc.next();
                    System.out.println("Ingrese su contraseña: ");
                    String contra = sc.next();
                    if ((Cline.getPersonas().get(pos).getCorreo().equals(correo))) {
                        if (fl.getContrasena().equals(contra)) {
                            if (Cline.getPersonas().get(pos2) instanceof Freelance) {
                                Cline.getPersonas().remove(pos2);
                            } else {
                                System.out.println("No eligio un Freelance - Ingrese de nuevo");
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("ERROR!!");
            }
            System.out.println("Continua{s/n}: ");
            resp = sc.next().charAt(0);
        }
    }

}

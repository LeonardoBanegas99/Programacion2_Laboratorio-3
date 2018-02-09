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

}

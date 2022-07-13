import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String username = "";
        String password = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un nombre de usuario");
        username = sc.nextLine();
        System.out.println("Ingrese una contraseña");
        password = sc.nextLine();
        System.out.println("Registro exitoso");
        final int Intentos = 3;
        boolean acierto = false;
        String usuario = "";
        String contraseña = "";
        System.out.println(usuario + contraseña);
        for (int i = 0; i < Intentos && !acierto; i++) {
            System.out.println("Introduzca su usuario y contraseña");
            usuario = sc.nextLine();
            contraseña = sc.nextLine();
            if (usuario.equals(username) && contraseña.equals(password)){
                System.out.println("Bienvenido "+ username);
            acierto = true;
            }else {
                System.out.println("Datos erroneos, por favor intente de nuevo");
                acierto = false;
            }
        }
    }
}
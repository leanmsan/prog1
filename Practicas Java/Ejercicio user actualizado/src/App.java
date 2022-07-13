import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String YesNo = "y";
        String yesno = "";
        String inses = "";
        boolean login = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido, posee una cuenta? (y/n)");
        yesno = sc.nextLine();
        if (yesno.equals(YesNo)) {
            InicioSesion();
        }else {
            Registro();
        }
        System.out.println("Desea iniciar sesion? (y/n)");
        inses = sc.nextLine();
        if (inses.equals("n")) {
            System.out.println("Gracias");
        }else {
            InicioSesion();
        }
    }

    public static void Registro() {
        String username = "";
        String password = "";
        String YesNo = "y";
        String sino = "";
        boolean login = false;
        Scanner reg = new Scanner(System.in);
        System.out.println("Ingrese un nombre de usuario");
        username = reg.nextLine();
        System.out.println("Ingrese una contraseña");
        password = reg.nextLine();
        System.out.println("Registro exitoso");
    }

    public static void InicioSesion() {
        String username = "";
        String password = "";
        String usuario = "";
        String contraseña = "";
        boolean acierto = false;
        int Intentos = 3;
        Scanner inses = new Scanner(System.in);
        for (int i = 0; i < Intentos && !acierto; i++) {
            System.out.println("Introduzca su usuario y contraseña");
            usuario = inses.nextLine();
            contraseña = inses.nextLine();
            if (usuario.equals(username) && contraseña.equals(password)) {
                System.out.println("Bienvenido "+ username);
                acierto = true;
            }else {
                System.out.println("Datos erroneos, intente de nuevo");
                acierto = false;
            }
        }
    }
}

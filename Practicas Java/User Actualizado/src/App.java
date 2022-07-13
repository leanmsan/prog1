import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String username = "";
        String password = "";
        String usuario = "";
        String contraseña = "";
        String YesNo = "y";
        String yesno = "";
        String login = "";
        boolean log_in = false;
        boolean acierto = false;
        final int Intentos = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido, posee una cuenta? (y/n)");
        yesno = sc.nextLine();
        if (yesno.equals(YesNo)) {
            switch (YesNo) 
            {
                case "failogin": yesno.equals(YesNo);
                    for (int i = 0; i < Intentos && !acierto; i++) {
                        System.out.println("Introduzca su usuario y contraseña");
                        usuario = sc.nextLine();
                        contraseña = sc.nextLine();
                        if (usuario.equals(username) && contraseña.equals(password)) {
                            System.out.println("Bienvenido "+ username);
                            acierto = true;
                        }
                    }
                break;
                default: acierto = false;
                break;
            }
        }else {
            switch (login)
            {
                case "Registro": yesno.equals("n");
                    System.out.println("Ingrese un nombre de usuario");
                    username = sc.nextLine();
                    System.out.println("Ingrese una contraseña");
                    password = sc.nextLine();
                    System.out.println("Regisrto exitoso, desea iniciar sesion? (y/n)");
                    login = sc.nextLine();
                    if (login.equals("y")) {
                        log_in = true;
                    }else {
                        System.out.println("Gracias");
                    }
                break;

                case "InicioSesion": log_in = true;
                    for (int i = 0; i < Intentos && !acierto; i++) {
                    System.out.println("Introduzca su usuario y contraseña");
                    usuario = sc.nextLine();
                    contraseña = sc.nextLine();
                    if (usuario.equals(username) && contraseña.equals(password)) {
                        System.out.println("Bienvenido "+ username);
                        acierto = true;
                        }
                    }
                break;

                default: log_in = false;
                break;
            }
        }
    }
}
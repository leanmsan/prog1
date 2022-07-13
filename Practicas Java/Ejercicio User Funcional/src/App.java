import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String username = "";
        String password = "";
        String usuario = "";
        String constraseña = "";
        String YesNo = "y";
        String yesno = "";
        boolean login = false;
        boolean acierto = false;
        int Intentos = 3;
            Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenido, posee una cuenta? (y/n)");
            YesNo = sc.nextLine();
            switch (YesNo) 
        {
            case "faillogin": yesno.equals(YesNo);
                for (int i = 0; i < Intentos && !acierto; i++) {
                    System.out.println("Introduzca su usuario y contraseña");
                    usuario = sc.nextLine();
                    constraseña = sc.nextLine();
                    if (usuario.equals(username) && constraseña.equals(password)) {
                        System.out.println("Bienvenido " + username);
                        acierto = true;
                    }else {
                        System.out.println("Datos erroneos, intente de nuevo");
                        acierto = false;
                    }
                }
                break;
            
            case "Registro": yesno.equals("n");
                System.out.println("Ingrese un nombre de usuario");
                username = sc.nextLine();
                System.out.println("Ingrese una contraseña");
                password = sc.nextLine();
                System.out.println("Registro exitoso, desea iniciar sesion? (y/n)");
                yesno = sc.nextLine();
                if (yesno.equals("y")) {
                login = true;
                }else {
                System.out.println("Gracias");
                }
                break;
            
            case "InicioSesion": login = true;
                for (int i = 0; i < Intentos && !acierto; i++) {
                System.out.println("Introduzca su usuario y contraseña");
                usuario = sc.nextLine();
                constraseña = sc.nextLine();
                if (usuario.equals(username) && constraseña.equals(password)) {
                    System.out.println("Bienvenido " + username);
                    acierto = true;
                }else {
                    System.out.println("Datos erroneos, intente de nuevo");
                    acierto = false;
                }
            }
            break;

            default: login = false;
            break;
        }
    }
}
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String fullname = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su primer nombre");
        String name = sc.nextLine();
        System.out.println("Ingrese su segundo nombre");
        String sname = sc.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = sc.nextLine();
        fullname = name + sname + apellido;
        System.out.println("Bienvenido "+ fullname);
    }
}
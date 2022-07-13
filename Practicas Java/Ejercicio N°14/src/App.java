import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int n1;
        int n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de 4 digitos");
        n1 = sc.nextInt();
        System.out.println("Ingrese otro numero de 4 digitos");
        n2 = sc.nextInt();
        if (n1 < 0) {
            n1 = (-1) * n1;
        }
        if (n2 < 0) {
            n2 = (-1) * n2;
        }
        int Aux1 = n1 / 100;
        int Aux2 = n2 % 100;
        int Res = (Aux1 * 100) + Aux2;
        System.out.println("El resultado es: " +Res);
    }
}
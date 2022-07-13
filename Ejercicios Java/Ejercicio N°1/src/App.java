import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int Aux = n1 - 1;
        int Res  = n1;
        Scanner sc = new Scanner(System.in)
        System.out.println("Ingrese un numero");
        int n1 = sc.nextInt();
        while (Aux > 1) {
            Res = Res * Aux;
            Aux--;
        }
        System.out.println("El factorial de "+ n1 +" es "+ Res);
    }
}

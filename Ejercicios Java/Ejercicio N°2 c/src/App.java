import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int base = 1;
        int exp = 1;
        int producto = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        base = sc.nextInt();
        System.out.println("Ingrese un exponente");
        exp = sc.nextInt();
    if (base > 0) {
        for (int i = 1; i <= exp; i++) {
            if (producto == 0) {
                producto = base * base;
            }else {
                int Aux1 = producto * base;
                producto = Aux1;
            }
        }
    }else {
        System.out.println("Numero Incorrecto");
    }
    System.out.println("El resultado es: "+ producto);
    }
}

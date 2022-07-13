import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado de un cuadrado");
        double n = sc.nextDouble();
        Cuadrado cuadrado1 = new Cuadrado();
        cuadrado1.setLado(n);
        System.out.println("El lado ingresado es: " + cuadrado1.getLado());
        System.out.println("El area del cuadrado es: " + cuadrado1.CalcularArea());
        System.out.println("El perimetro de ese cuadrado es: " + cuadrado1.CalcularPerimetro());
    }
}
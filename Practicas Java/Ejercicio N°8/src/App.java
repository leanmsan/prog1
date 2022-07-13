import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int n1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese un numero");
            n1 = sc.nextInt();
        }
        if (n1 % 2 == 0) {
            System.out.println(n1 +" es par");
        }else {
            System.out.println(n1 +" es Impar");
        }
    }
}

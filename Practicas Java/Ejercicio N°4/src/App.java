import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //declaracion da variables
        int n1;
        int n2;
        try (Scanner sc = new Scanner(System.in)) {
            //lee el primer numero 
            System.out.println("Ingrese un numero");
            n1 = sc.nextInt();

            //lee el segundo numero
            System.out.println("Ingrese otro numero");
            n2 = sc.nextInt();
        }
        if (n1 >= n2) {
            System.out.println(n1 +" es el mayor");
        }else {
            System.out.println(n2 +" es el mayor");
        }
    }
}

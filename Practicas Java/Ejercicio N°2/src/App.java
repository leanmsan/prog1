import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //declaracion de variables
        int n1;
        int n2;
        int n3;
        try (Scanner sc = new Scanner(System.in)) {
            //leer un numero
            System.out.println("Introduce un numero: ");
            n1 = sc.nextInt(); //lee un numero por teclado
        }

        //anterior y siguiente de un numero
        
        n2= n1 - 1; // n1++ es equivalente a n1=n1+1
        n3= n1 + 1; 
        System.out.println("Su anterior es "+ n2);
        System.out.println("Su siguiente es "+ n3);
    }
}
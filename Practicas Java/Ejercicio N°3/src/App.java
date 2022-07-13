import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //declaracion de variables 
        int n1;
        int n2;
        int aux;
        try (Scanner sc = new Scanner(System.in)) {
            //lee el primer numero 
            System.out.println("Ingrese un numero");
            n1 = sc.nextInt();

            //lee el segundo numero
            System.out.println("Ingrese otro numero");
            n2 = sc.nextInt();

            //muestra los numeros 
            System.out.println("Los numeros ingresados son A "+ n1 + " y B "+ n2);
        }

        //intercambio de variables
        aux = n1;
        n1 = n2;
        n2 = aux;

        //muestra el intecambio de numeros (solamente para comprobar)
        System.out.println("Ahora A es "+ n1 + " y B es "+ n2);
    }
}

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //declaracion de variables
        int n1;
        try (Scanner sc = new Scanner(System.in)) {
            //lee la cantidad de lados ingresados
            System.out.println("Ingrese un numero");
            n1 = sc.nextInt();
        }

        //resolucion del ejercicio
        
        if (n1 == 3) {
            System.out.println("Es un Triángulo");
        }else {
            if (n1 == 4) {
                System.out.println("Es un Cuadilátero");   
            }else {
                if (n1 == 5) {
                    System.out.println("Es un Pentágono");
                }else {
                    System.out.println("No es un Triángulo, Cuadilátero o Pentágono");
                }
            }
        }
    }
}
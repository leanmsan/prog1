import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int n1;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        try (Scanner sc = new Scanner(System.in)) {
            //lee el primer numero
            System.out.println("Ingrese un numero");
            n1 = sc.nextInt();

            //lee el segundo numero
            System.out.println("Ingrese otro numero");
            n2 = sc.nextInt();

            //lee el tercer numero
            System.out.println("Ingrese otro numero");
            n3 = sc.nextInt();
        }

        //operaciones con los numeros

        n4 = n1 + n2 + n3;
        n5 = n1 - n2;
        n6 = n2 * n3;
        n7 = n1 / n3;
        System.out.println("La suma de los tres es "+ n4);
        System.out.println("La diferencia del primero con el segundo es "+ n5);
        System.out.println("El producto de los ultimos es "+ n6);
        System.out.println("La division entre el primero y el tercero es "+ n7);

    }
}

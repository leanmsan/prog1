import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int n1;
        int n2;
        int n3;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese un numero");
            n1 = sc.nextInt();
            System.out.println("Ingrese otro numero");
            n2 = sc.nextInt();
            System.out.println("Ingrese otro numero");
            n3 = sc.nextInt();
        }
        if (n1 >= n2){
            if (n1 >= n3) {
                System.out.println("El numero mayor es "+ n1);
            }else {
                System.out.println("El numero mayor es "+ n3);
            }
        }else {
            if (n2 >= n3) {
                System.out.println("El numero mayor es "+ n2);
            }else {
                System.out.println("El numero mayor es "+ n3);
            }
        }
    }
}

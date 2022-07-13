import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int n1;
        int Res;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese un numero");
            n1 = sc.nextInt();
        }
        if (n1 < 1000) {
            if (n1 > 0){
                if (n1 <= 9){
                    Res = n1 * n1;
                    System.out.println(Res);
                }else {
                    if (n1 <= 99) {
                        Res = n1 * 2;
                        System.out.println(Res);
                    }else {
                        Res = n1 - 100;
                        System.out.println(Res);
                    }
                }
            }else {
                System.out.println("Numero no válido");
            }
        }else {
            System.out.println("Numero no válido");
        }
    }
}

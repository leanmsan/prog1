import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int n1 = 1;
        int exp = 1;
        int Res = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        n1 = sc.nextInt();
        System.out.println("Ingrese el exponente");
        exp = sc.nextInt();
        int i = 1;
        if (exp > 1) {
            for (i = 1; i <= exp; i++) {
                Res = n1 * n1;
            }
            System.out.println(n1 + " elevado a " + exp + " es " + Res);
        }else {
            if (exp == 1){
                Res = n1;
                System.out.println(n1 + " elevado a " + exp + " es " + Res);
            }else {
                if (exp == 0){
                    Res = 1;
                    System.out.println(n1 + " elevado a " + exp + " es " + Res);
                }
            }
        }
}
}

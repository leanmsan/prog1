import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int n1;
        int exp;
        int res = CalculatePower(n1,exp);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        n1 = sc.nextInt();
        System.out.println("Ingrese un exponente");
        exp = sc.nextInt();
    }
    static int CalculatePower (int num, int pow) {
        if (pow == 0){
            return 1;
        }else {
            return num * CalculatePower(num, pow - 1);
        }
        
    }
}

import java.util.Scanner;
public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n1 = sc.nextInt();
        System.out.println("Ingrese otro numero");
        int n2 = sc.nextInt();
        if (n1 >= n2){
            System.out.println(n1 +" es el mayor");
        }else {
            System.out.println(n2 +" es el mayor");
        }
    }
}
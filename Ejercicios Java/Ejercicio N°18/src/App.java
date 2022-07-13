import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n1 = sc.nextInt();
        String binaryString = Long.toBinaryString(n1);
        System.out.println(binaryString);
    }
}
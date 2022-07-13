import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int nlength = sc.nextInt();
        int[] vector = new int[nlength];
        for (int i = 0; i < nlength; i++) {
            vector[i] = sc.nextInt();
        }
        int cont = 0;
        int sum = 0;
        for (int i = 0; i < nlength; i++) {
            if (vector[i] >= 5) {
                sum = sum + vector[i];
                cont++;
            }
        }
        System.out.println(sum);
        System.out.println(cont);
    }
}
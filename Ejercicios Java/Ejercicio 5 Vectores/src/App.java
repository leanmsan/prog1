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
        int i = 0;
        while (i < nlength) {
            System.out.println(vector[i]);
            System.out.println("posicion " + i);
            i = i + 2;
        }
    }
}
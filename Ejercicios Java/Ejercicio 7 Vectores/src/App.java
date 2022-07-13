import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int nlength = sc.nextInt();
        int[] vectorA = new int[nlength];
        int[] vectorB = new int[nlength];
        double[] vectorC = new double[nlength];
        for (int i = 0; i < nlength; i++) {
            vectorA[i] = sc.nextInt();
            vectorB[i] = sc.nextInt();
        }
        for (int i = 0; i < nlength; i++) {
            vectorC[i] = (vectorA[i] * vectorB[i]) / 2;
            System.out.println(vectorC[i]);
        }
    }
}
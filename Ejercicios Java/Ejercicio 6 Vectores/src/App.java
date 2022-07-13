import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int n1 = sc.nextInt();
        int j = 0;
        int [] VectorA = new int[n1];
        int [] VectorB = new int[j];
        for (int i = 0; i < n1; i++){
            VectorA[i] = sc.nextInt();
        }
        for (int i = 0; i < n1; i++){
            if (VectorA[i] > 0){
                VectorB[j] = VectorA[i];
                j++;
            }
        }
        for (int i = 0; i < n1; i++){
            System.out.println(VectorA[i]);
        }
        for (int h = 0; h < j; h++){
            System.out.println(VectorB[h]);
        }
    }
}
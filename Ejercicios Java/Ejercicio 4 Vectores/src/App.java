import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int nlength = sc.nextInt();
        int [] vector = new int[nlength];
        for (int i = 0; i < nlength; i++){
            System.out.println("Ingrese un valor");
            vector[i] = sc.nextInt();
        }
        int may = vector[0];
        for (int i = 1; i < nlength; i++){
            if (vector[i] > may){
                may = vector[i];
            }
        }
        System.out.println("En numero mayor ingresado es " + may);
    }
}
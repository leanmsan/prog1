import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int nlength = sc.nextInt();
        int [] vector = new int[nlength];
        for (int i = 0; i < nlength; i++){
            vector[i] = sc.nextInt();
            suma = suma + vector[i];
        }
        int prom = suma / nlength;
        for (int i = 0; i < nlength; i++){
            if (vector[i] > prom){
                System.out.println("El numero mayor al promedio es " + vector[i]);
            }
        }
    }
}
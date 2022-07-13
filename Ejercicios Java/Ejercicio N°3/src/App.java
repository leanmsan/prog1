import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int ndias;
        int dias = 0;
        int semanas = 0;
        int meses = 0;
        int años = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        ndias = sc.nextInt();
        while (ndias >= 365) {
            años++;
            ndias = ndias - 365;
        }
        while (ndias >= 30) {
            meses++;
            ndias = ndias - 30;
        }
        while (ndias >= 7) {
            semanas++;
            ndias = ndias - 7;
        }
        dias = ndias;
        System.out.println("El numero representa: " + años + " años, " + meses + " meses, " + semanas + " semanas, " + dias + " dias.");
    }
}

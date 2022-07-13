import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class App {
    public static void main(String[] args) throws Exception {
        int ndias;
        int semanas = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        ndias = sc.nextInt(); 
        LocalDate hoy = LocalDate.now();
        LocalDate FechaRef = LocalDate.now().plusDays(ndias);
        Period hastafechref = Period.between(hoy, FechaRef);
        int años = hastafechref.getYears();
        int meses = hastafechref.getMonths();
        int dias = hastafechref.getDays();
        while (dias >= 7) {
            dias = dias - 7;
            semanas++;
        }
        System.out.println(ndias + " dias equivale a: " + años + " años, " + meses + " meses, " + semanas + " semanas y " + dias + " dias");
    }
}
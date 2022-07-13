import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int sexo = 0;
        short edad = 0;
        int t1 = 0;
        int tmin = 40;
        int tmaxh = 60;
        int tmaxm = 80;
        int ncomp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de competidores");
        ncomp = sc.nextInt();
        for (int i = 1; i <= ncomp; i++) {
            System.out.println("Ingrese sexo del competidor");
            sexo = sc.nextInt();
            System.out.println("Ingrese edad del competidor");
            edad = sc.nextShort();
            System.out.println("Ingrese el tiempo del competidor");
            t1 = sc.nextInt();
            switch (sexo)
            {
                case 1: sexo = 1;
                    if (edad >= 35 && t1 >= tmin && t1 <= tmaxh) {
                        System.out.println("Califica");
                    }else {
                        System.out.println("No Califica");
                    }
                break;

                case 2: sexo = 2; 
                    if (edad >= 30 && t1 >= tmin && t1 <= tmaxm) {
                        System.out.println("Califica");
                    }else {
                        System.out.println("No Califica");
                    }
                break; 
                
                default: System.out.println("Datos erroneos");
                break;
            }
        }
    }
}
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int opcion = 0;
        
        do {
            System.out.println("Seleccione una opcion");
            System.out.println("1- Calcular el IMC de la persona");
            System.out.println("2- Comprobar si es mayor de edad");
            System.out.println("3- Comprobar Sexo");
            System.out.println("4- Devolver todos los datos de la persona");
            System.out.println("5- Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        } while (opcion != 5);

        if (opcion == 5) {
            System.out.println("Gracias");
        }
    }
}
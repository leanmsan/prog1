import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la edad");
        int edad = sc.nextInt();
        System.out.println("Ingrese el numero de documento");
        int documento = sc.nextInt();
        System.out.println("Ingrese el sexo (H/M)");
        String sexo = sc.next();
        System.out.println("Ingrese el peso (kg)");
        double peso = sc.nextDouble();
        System.out.println("Ingrese la altura (mtros.)");
        double altura = sc.nextDouble();
        Persona persona1 = new Persona(nombre, edad, documento, sexo, peso, altura);
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
                    System.out.println("El indice de masa corporal de la persona es " + persona1.calcularIMC());
                    break;
                case 2:
                    System.out.println("Mayor de edad: " + persona1.esMayorDeEdad());
                    break;
                case 3:
                    System.out.println("Ingrese el sexo");
                    String compSexo = sc.next();
                    System.out.println(persona1.comprobarSexo(compSexo));
                    break;
                case 4:
                    System.out.println(persona1.toString());
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
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
        String sexo = sc.nextLine();
        System.out.println("Ingrese el peso (kg)");
        double peso = sc.nextDouble();
        System.out.println("Ingrese la altura (mtros.)");
        double altura = sc.nextDouble();
        Persona persona1 = new Persona();
        persona1.setNombre(nombre);
        persona1.setEdad(edad);
        persona1.setDocumento(documento);
        persona1.setSexo(sexo);
        persona1.setPeso(peso);
        persona1.setAltura(altura);
    }
}

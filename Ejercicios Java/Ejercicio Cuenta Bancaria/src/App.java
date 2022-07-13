import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta");
        int NroCuenta = sc.nextInt();
        System.out.println("Ingrese el Dni del titular");
        int Dni = sc.nextInt();
        System.out.println("Ingrese el apellido del titular");
        String Apellido = sc.next();
        System.out.println("Ingrese el nombre del titular");
        String Nombre = sc.next();
        System.out.println("Ingrese el saldo de la cuenta");
        double Saldo = sc.nextDouble();
        System.out.println("Seleccione el tipo de cuenta");
        System.out.println("1- Cuenta Corriente");
        System.out.println("2- Caja de Ahorro");
        int TipoCuenta = sc.nextInt();
        boolean EsCuentaCorriente;
        if (TipoCuenta == 1) {
            EsCuentaCorriente = true;
        } else {
            EsCuentaCorriente = false;
        }
        CuentaBancaria cuentabancaria1 = new CuentaBancaria(NroCuenta, Dni, Apellido, Nombre, Saldo, EsCuentaCorriente);
        int opcion;
        do {
            System.out.println(
                    "Seleccione una opcion" + "\n" + "1- Realizar un deposito" + "\n" + "2- Realizar una extraccion"
                            + "\n" + "3- Ver saldo de la cuenta" + "\n" + "4- Ver datos del titular de la cuenta" + "\n"
                            + "5- Ver los datos de la cuenta" + "\n" + "6- Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el monto a depositar");
                    double montodeposito = sc.nextDouble();
                    cuentabancaria1.Deposito(montodeposito);
                    System.out.println("Deposito realizado exitosamente" + "\n" + "Su saldo ahora asciende a: "
                            + cuentabancaria1.getSaldo());
                    break;
                case 2:
                    System.out.println("Ingrese el monto a extraer");
                    double montoextraccion = sc.nextDouble();
                    if (cuentabancaria1.Extraccion(montoextraccion) == true) {
                        System.out.println("Extraccion realizada exitosamente" + "\n" + "Su saldo ahora asciende a: " + cuentabancaria1.getSaldo());
                    } else {
                        System.out.println("No se pudo realizar la extraccion. Intente nuevamente");
                    }
                    break;
                case 3:
                    System.out.println("El saldo de la cuenta asciende a " + cuentabancaria1.getSaldo());
                    break;
                case 4:
                    System.out.println("Detalles del titular de la cuenta");
                    System.out.println(cuentabancaria1.DatosTitular());
                    break;
                case 5:
                    System.out.println("Detalles de la cuenta");
                    System.out.println(cuentabancaria1.DatosCuenta());
                    break;
            }
        } while (opcion != 6);

        if (opcion == 6) {
            System.out.println("Gracias");
        }
    }
} 
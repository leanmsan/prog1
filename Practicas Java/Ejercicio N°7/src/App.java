import java.util.Scanner;
public class App {
    public static void main (String[] args) throws Exception{
       Scanner sc = new Scanner(System.in);
        int nHamb;
        String tipoHamb;
        String ModoPago;
        double precioFinal;
       
            System.out.println("Ingrese la cantidad de hamburguesas");
            nHamb = sc.nextInt();
            //sc.nextLine();
            System.out.println("Ingrese el tipo de hamburguesas");
            tipoHamb = sc.next();
            System.out.println("Ingrese el modo de pago");
            ModoPago = sc.next();
            switch (tipoHamb) 
        {
            case "sencilla":  
                if (ModoPago.equals("tarjeta")) {
                    precioFinal = (nHamb * 20) * 1.05;
                    System.out.println("Total a pagar es "+ precioFinal);
                }else {
                    precioFinal = nHamb * 20;
                    System.out.println("Total a pagar es "+ precioFinal);
                }
            break;

            case "doble": 
                if (ModoPago.equals("tarjeta")) {
                    precioFinal = (nHamb * 25) * 1.05;
                    System.out.println("Total a pagar es "+ precioFinal);
                }else {
                    precioFinal = nHamb * 25;
                    System.out.println("Total a pagar es "+ precioFinal);
                }
            break;

            case "triple":
                if (ModoPago.equals("tarjeta")) {
                    precioFinal = (nHamb * 28) * 1.05;
                    System.out.println("Total a pagar es "+ precioFinal);
                }else {
                    precioFinal = nHamb * 28;
                    System.out.println("Total a pagar es "+ precioFinal);
                }
            break;

            default: tipoHamb = "tipo inválido";
            break;
        }
        }   
    }
   
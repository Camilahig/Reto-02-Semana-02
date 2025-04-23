import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CajeroAutomatico cajeroBBVA = new CajeroAutomatico(1000); // Removed "saldo:" parameter name
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello and welcome!"); // Changed printf to println

        int choice;
        do {
            cajeroBBVA.mostrarMenu();
            System.out.println("Elige una opción del menu");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Su saldo actual es de: $" + cajeroBBVA.consultarSaldo());
                    break;
                case 2:
                    System.out.println("Ingresa la cantidad que quieres depositar: ");
                    double deposito = sc.nextDouble();
                    cajeroBBVA.depositarDinero(deposito);
                    break;
                case 3:
                    System.out.println("Ingresa la cantidad que quieres retirar: ");
                    double retiro = sc.nextDouble();
                    cajeroBBVA.retirarDinero(retiro);
                    break;
                case 4:  // Added explicit case for exit option
                    System.out.println("Bye bye! gracias por usar el cajero de BBVA");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo");
                    break;
            }
        } while(choice != 4);

        sc.close();
    }
}
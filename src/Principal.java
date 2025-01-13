
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consultar = new ConsultaMoneda();

        int opcion = 0;
        while (opcion != 8){
            System.out.println("***********************\n" +
                    "Bienvenido al convertidor de monedas\n"+
                    "Elija la conversión que desea realizar\n"+
                    "1. Dollar a peso argentino\n" +
                    "2. Peso argentino a Dollar\n" +
                    "3. Dollar a Real Brasilero\n" +
                    "4. Real Brasilero a Dollar\n" +
                    "5. Dollar a Peso Colombiano\n" +
                    "6. Peso Colombia a Dollar\n" +
                    "7. Convetir otra monera\n"+
                    "8. Salir\n");

            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consultar,lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consultar, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consultar, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL","USD",consultar,lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD","COP",consultar,lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP","USD",consultar,lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consultar,lectura);
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
    }
}

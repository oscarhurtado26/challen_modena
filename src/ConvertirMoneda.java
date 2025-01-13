import java.util.Locale;
import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaTarget, ConsultaMoneda consultar, Scanner lectura ) {

        double cantidad;
        double cantidadConvertir;

        Moneda moneda = consultar.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("Tasa de conversion \n1 " + monedaBase + " = " +moneda.conversion_rate()+ " "+ monedaTarget);
        System.out.println("Ingrese la cantidad " +monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertir = cantidad * moneda.conversion_rate();
        System.out.println(cantidad + " " + monedaBase + " = " + cantidadConvertir + " " + moneda.target_code());
    }

    public static void convertirOtraMoneda( ConsultaMoneda consultar, Scanner lectura){

        System.out.println("Ingrese el codigo de la moneda base: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda a convertir");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase,monedaObjetivo, consultar, lectura);
    }

}

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneradorArhivo {
   /** public static void guardarjson(String json, String monedaBase, String monedaTarget){
        try (FileWriter writer = new FileWriter("moneda_" + monedaBase + "_a_" + monedaTarget + ".json")) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonFormateado = gson.toJson(new Gson().fromJson(json, Object.class));
            writer.write(jsonFormateado);
            writer.close();
            System.out.println("El archivo se ha generado con exito.");

        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }**/

   public static void guardarjson(List<Moneda> consulta){
       try (FileWriter writer = new FileWriter( "consultas_monedas.json" + true)) {
           Gson gson = new GsonBuilder().setPrettyPrinting().create();
           String jsonFormateado = gson.toJson(consulta);
           writer.write(jsonFormateado);
           writer.close();
           System.out.println("El archivo se ha generado con exito.");

       } catch (IOException e) {
           System.out.println("Error al guardar el archivo: " + e.getMessage());
       }
   }
}

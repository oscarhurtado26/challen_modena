import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class ConsultaMoneda {
    private ConsultaMonedas todasLasConsultas;

    public ConsultaMoneda() {
        todasLasConsultas = new ConsultaMonedas();
    }

    public Moneda buscarMoneda(String monedaBase, String monedaTarget){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/452f3c74a04b974d3578c65c/pair/"+monedaBase+"/"+monedaTarget+"/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Moneda moneda = new Gson().fromJson(response.body(), Moneda.class);
            todasLasConsultas.agregarConsulta(moneda);
            GeneradorArhivo.guardarjson(todasLasConsultas.getConsultas());

            //GeneradorArhivo.guardarjson(response.body(), monedaBase,monedaTarget);
            //return new Gson().fromJson(response.body(), Moneda.class);
            return moneda;
        } catch (Exception e) {
            throw new RuntimeException("No encontre la moneda que busca");
        }
    }


}

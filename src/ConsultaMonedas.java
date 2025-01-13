import java.util.ArrayList;
import java.util.List;

public class ConsultaMonedas {
    private List<Moneda> consultas;

    public  ConsultaMonedas(){
        consultas = new ArrayList<>();
    }
    public void agregarConsulta(Moneda moneda){
        consultas.add(moneda);
    }

    public List<Moneda> getConsultas(){
        return consultas;

    }
}

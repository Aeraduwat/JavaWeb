package turismo.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.ejb.Stateless;
import turismo.dominio.Cliente;
import turismo.dominio.Destino;
import turismo.dominio.Periodo;
import turismo.dominio.Viaje;

@Stateless
public class TurismoService {

    public List<Destino> buscarDestinosTodos() {
        List<Destino> lista = new ArrayList<>();
        int id = 0;
        lista.add(new Destino(++id, "Machu Picchu, Perú", 150000));
        lista.add(new Destino(++id, "Taj Mahal, Agra, India", 175000));
        lista.add(new Destino(++id, "Basílica de San Pedro del Vaticano, Roma", 200000));
        lista.add(new Destino(++id, "Gran Muralla China en Mutianyu, Pekín", 300000));
        lista.add(new Destino(++id, "Puente Golden Gate, San Francisco", 250000));
        lista.add(new Destino(++id, "Estatua de Cristo Redentor, Río de Janeiro", 450000));

        return lista;
    }

    public Destino buscarDestino(Integer id) {
        Destino destino = null;
        for (Destino d : buscarDestinosTodos()) {
            if (d.getId().equals(id)) {
                destino = d;
                break;
            }
        }
        return destino;
    }

    public Viaje reservar(Cliente cliente, Destino destino, Periodo periodo, boolean vip) throws TurismoServiceException {
        // dias de viaje
        int cantidadDias = (int) TimeUnit.DAYS.convert(periodo.getTermino().getTime() - periodo.getInicio().getTime(), TimeUnit.MILLISECONDS);
        
        if (cantidadDias < 5){
            throw new TurismoServiceException("Debe seleccionar por lo menos 5 días de estadía.");
        }
        
        // costo total segun seleccion
        int valorNoche = destino.getValorNoche();
        if (vip) {
            // El factor se debe obtener desde la base de datos
            float factor = 1.25f;
            valorNoche = Math.round(valorNoche * factor);
        }
        int costo = valorNoche * cantidadDias;
        // objeto viaje
        Viaje viaje = new Viaje();
        viaje.setCliente(cliente);
        viaje.setDestino(destino);
        viaje.setPeriodo(periodo);
        viaje.setCostoTotal(costo);
        viaje.setVip(vip);

        return viaje;
    }
    
}

package turismo.dominio;

public class Destino {
    private Integer id;
    private String nombre;
    private Integer valorNoche;

    public Destino() {
    }

    public Destino(Integer id, String nombre, Integer valorNoche) {
        this.id = id;
        this.nombre = nombre;
        this.valorNoche = valorNoche;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getValorNoche() {
        return valorNoche;
    }

    public void setValorNoche(Integer valorNoche) {
        this.valorNoche = valorNoche;
    }
    
}

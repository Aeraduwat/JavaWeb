package turismo.dominio;

/**
 *
 * @author rvega77
 */
public class Viaje {
    private Cliente cliente;
    private Destino destino;
    private Periodo periodo;
    private boolean vip;
    private Integer costoTotal;

    public Viaje() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Integer getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Integer costoTotal) {
        this.costoTotal = costoTotal;
    }
    
    
}

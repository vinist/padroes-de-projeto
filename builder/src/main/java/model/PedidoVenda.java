package model;

import java.util.List;

public class PedidoVenda {

    private String numero;
    private Cliente cliente;
    private List<ItemPedido> itensPedido;
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }
    
    public void setItensPedido(List<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }
    
    @Override
    public String toString() {
        return "PedidoVenda{" + "numero='" + numero + '\'' + ", cliente=" + cliente + ", itensPedido=" + itensPedido + '}';
    }
}
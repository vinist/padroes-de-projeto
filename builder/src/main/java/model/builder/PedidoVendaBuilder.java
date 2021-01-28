package model.builder;

import model.Cliente;
import model.ItemPedido;
import model.PedidoVenda;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PedidoVendaBuilder {

    private final PedidoVenda instance;
    
    public PedidoVendaBuilder() {
        this.instance = new PedidoVenda();
    }
    
    public PedidoVendaBuilder comClienteVip(String nome) {
        definirCliente(nome, true);
        return this;
    }
    
    public PedidoVendaBuilder comClienteNormal(String nome) {
        definirCliente(nome, false);
        return this;
    }
    
    private void definirCliente(String nome, boolean vip) {
        var cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setVip(vip);
        this.instance.setCliente(cliente);
    }
    
    public PedidoVendaBuilder comItem(String nome, Integer quantidade, String valor) {
        var itemPedido = new ItemPedido();
        itemPedido.setNome(nome);
        itemPedido.setQuantidade(quantidade);
        itemPedido.setValorUnitario(new BigDecimal(valor));
        
        if(this.instance.getItensPedido() == null){
            this.instance.setItensPedido(new ArrayList<>());
        }
        
        this.instance.getItensPedido().add(itemPedido);
        
        return this;
    }
    
    
    /**
     * Torna obrigatorio informar o numero para chamar o build()
     * @param numero
     * @return
     */
    public PedidoVendaValidoBuilder comNumero(String numero) {
        this.instance.setNumero(numero);
        return new PedidoVendaValidoBuilder(this.instance);
    }
}

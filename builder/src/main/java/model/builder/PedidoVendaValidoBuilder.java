package model.builder;

import model.PedidoVenda;

public class PedidoVendaValidoBuilder {

    private final PedidoVenda instance;
    
    public PedidoVendaValidoBuilder(PedidoVenda instance) {
        this.instance = instance;
    }
    
    public PedidoVenda build() {
        return this.instance;
    }
}

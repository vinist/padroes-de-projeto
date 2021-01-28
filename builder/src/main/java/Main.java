import model.builder.PedidoVendaBuilder;

public class Main {
    
    public static void main(String[] args) {
        var pedidoVenda = new PedidoVendaBuilder()
                .comClienteVip("Gilberto da Silva")
                .comItem("Celular", 1, "1500")
                .comItem("Notebook", 1, "3000")
                .comNumero("3569")
                .build();
    
        System.out.println(pedidoVenda.toString());
    }
}

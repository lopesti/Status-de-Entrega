
package exercicio;

public class exercicio {
    public static void main(String[] args) {
        Pedido meuPedido = new Pedido(101);
        
        meuPedido.exibirDetalhes();
        
        // Alterando o status usando o ENUM
        meuPedido.setStatus(StatusEntrega.EM_TRANSITO);
        meuPedido.exibirDetalhes();
        
        // Exemplo de Switch com ENUM
        StatusEntrega statusAtual = StatusEntrega.ENTREGUE;
        switch (statusAtual) {
            case ENTREGUE -> System.out.println("O cliente já recebeu o pacote.");
            case CANCELADO -> System.out.println("Retornar produto ao estoque.");
            default -> System.out.println("Pedido em processamento.");
        }
    }
}
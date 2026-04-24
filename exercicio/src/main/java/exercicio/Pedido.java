
package exercicio;

public class Pedido {
    private final int id;
    private StatusEntrega status;

    public Pedido(int id) {
        this.id = id;
        this.status = StatusEntrega.PENDENTE; 
    }

    public void setStatus(StatusEntrega novoStatus) {
        this.status = novoStatus;
    }

    public void exibirDetalhes() {
        System.out.println("Pedido #" + id + " | Status Atual: " + status);
    }
}

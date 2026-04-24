/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;

public class Pedido {
    private final int id;
    private StatusEntrega status;

    public Pedido(int id) {
        this.id = id;
        this.status = StatusEntrega.PENDENTE; // Status inicial
    }

    public void setStatus(StatusEntrega novoStatus) {
        this.status = novoStatus;
    }

    public void exibirDetalhes() {
        System.out.println("Pedido #" + id + " | Status Atual: " + status);
    }
}
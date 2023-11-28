package Exercicio4.LojaVirtual;

import java.util.ArrayList;
import java.util.List;


public class Pedido implements Produto{
    
    private static int proximoNumero = 1;

    private String nomeCliente;
    private int numeroPedido;
    private List<Produto> lista;
    private double totalCompra;

    public Pedido(String nomeCliente) {
        lista = new ArrayList<>();
        this.nomeCliente = nomeCliente;
        this.numeroPedido = proximoNumero++;
    }

    @Override
    public double getPrecoTotal() {
        this.totalCompra = 0.0;
        for(Produto carrinho: lista){
	          this.totalCompra += carrinho.getPrecoTotal();
            }
	       return this.totalCompra;
    }
 
    public void adicionar(Produto compras){
        lista.add((Produto) compras);       
    }

    public void remover(Produto compras){
        lista.remove(compras);
    }

    @Override
    public String toString() {
        return "\nPedido número " + numeroPedido + "\nNome do cliente: " + nomeCliente + "\nItens do carrinho: " + lista
                + "\nValor total do pedido: " + getPrecoTotal() + "\n";
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }
       
}
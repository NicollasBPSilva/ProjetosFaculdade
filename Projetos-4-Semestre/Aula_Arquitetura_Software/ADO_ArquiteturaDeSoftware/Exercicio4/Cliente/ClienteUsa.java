package Exercicio4.Cliente;

import Exercicio4.LojaVirtual.Pedido;
import Exercicio4.LojaVirtual.Produto;
import Exercicio4.LojaVirtual.Promocao;

public class ClienteUsa {
    
    public static void main(String[] args) {
        
        Pedido carrinho = new Pedido("Uoxito");
        Produto prod1 = new Promocao("Mouse", 250.0, 0);
        Produto prod2 = new Promocao("Teclado", 300.0, 0);
        Produto prod3 = new Promocao("Fone", 480.0, 80.0);

        carrinho.adicionar(prod1);
        carrinho.adicionar(prod2);
        carrinho.adicionar(prod3);

        Escrever(prod2);
        carrinho.remover(prod2);

        Escrever(carrinho);

        Pedido carrinhoTest = new Pedido("Uelito");
        Produto prodTest1 = new Promocao("Chevette", 10000.0, 1000.0);
        Produto prodTest2 = new Promocao("Kit Turbo", 5000.0, 600.0);
        carrinhoTest.adicionar(prodTest1);
        carrinhoTest.adicionar(prodTest2);
        Escrever(carrinhoTest);

    }

    public static void Escrever (Object msg){
    	System.out.println(msg);
    }
}

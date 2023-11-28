package Exercicio2.Cliente;

import Exercicio2.RegraDeNegocio.*;
import Exercicio2.Produtos.Produto_Servico;

public class Main {
    
    public static void main(String[] args) {
        
        Produto_Servico prod1 = new Produto_Servico("Ar Condicionado", 2200.00);
        Produto_Servico prod2 = new Produto_Servico("Geladeira", 3000.00);
        Produto_Servico serv1 = new Produto_Servico("Lava Rapido", 35.00);

        Orcamento servico = new IMP1();
        Orcamento produto1 = new IMP2();
        Orcamento produto2 = new IMP3();

        double calc1 = produto1.calcularImposto(prod1.getValor());
        Escrever("O orçamento do produto \"" + prod1.getNome() + "\" ficou em R$ " + calc1);

        double calc2 = produto2.calcularImposto(prod2.getValor());
        Escrever("O orçamento do produto \"" + prod2.getNome() + "\" ficou em R$ " + calc2);

        double calc3 = servico.calcularImposto(serv1.getValor());
        Escrever("O orçamento do serviço \"" + serv1.getNome() + "\" ficou em R$ " + calc3);

    }

    public static void Escrever (Object msg){
    	System.out.println(msg);
    }

}

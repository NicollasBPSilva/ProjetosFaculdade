package AtividadeComplementar.Exercicio9_Pag4.Cliente;

import AtividadeComplementar.Exercicio9_Pag4.Calculo.Impostos;
import AtividadeComplementar.Exercicio9_Pag4.Produtos.Produto_Servico;

public class Main {
    
        public static void main(String[] args) {
        
        Produto_Servico prod1 = new Produto_Servico("Ar Condicionado", 2200.00);
        Produto_Servico prod2 = new Produto_Servico("Geladeira", 3000.00);
        Produto_Servico serv1 = new Produto_Servico("Lava Rapido", 35.00);

        double orcamento1 = Impostos.IMP3.calcularImposto(prod1.getValor());
        Escrever("O orçamento do produto " + prod1.getNome() + " ficou em R$ " + orcamento1);

        double orcamento2 = Impostos.IMP2.calcularImposto(prod2.getValor());
        Escrever("O orçamento do produto " + prod2.getNome() + " ficou em R$ " + orcamento2);

        double orcamento3 = Impostos.IMP1.calcularImposto(serv1.getValor());
        Escrever("O orçamento do serviço " + serv1.getNome() + " ficou em R$ " + orcamento3);

    }

    public static void Escrever (Object msg){
    	System.out.println(msg);
    }

}

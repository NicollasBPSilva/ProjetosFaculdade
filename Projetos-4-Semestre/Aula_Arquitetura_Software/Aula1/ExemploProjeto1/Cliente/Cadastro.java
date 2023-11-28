package ExemploProjeto1.Cliente;

import ExemploProjeto1.Heranca.Pessoa;
import ExemploProjeto1.Heranca.PessoaFisica;

public class Cadastro {

    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("Mel");
        PessoaFisica pf = new PessoaFisica("Gerson", 40028922000L);

        Escrever(p);
        Escrever("");
        Escrever(pf);

    }

    public static void Escrever(Object msg){
        System.out.println(msg);
    }

}
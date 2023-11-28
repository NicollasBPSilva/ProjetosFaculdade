package AtividadeComplementar.Exercicio1_Pag3.RH;

import CalcSalario.Departamentos.*;
import CalcSalario.Funcionario.Funcionario;

public class Base_Pagamento {
    
    public static void main(String[] args) {
        
        Funcionario fun1 = new Funcionario("Mario", 1200.00);
        Funcionario fun2 = new Funcionario("Roberta", 3000.00);
        Funcionario fun3 = new Funcionario("Diego", 2500.00);
        Funcionario fun4 = new Funcionario("Tobias", 1700.00);

        double salarioSup = Areas.SUPORTE.calcularSalario(fun1.getSalario());
        Escrever("Com a bonificação, o(a) funcionário(a) " + fun1.getNome() + " receberá: R$ " + salarioSup);

        double salarioGer = Areas.GERENCIA.calcularSalario(fun2.getSalario());
        Escrever("Com a bonificação, o(a) funcionário(a) " + fun2.getNome() + " receberá: R$ " + salarioGer);

        double salarioDev = Areas.DESENVOLVIMENTO.calcularSalario(fun3.getSalario());
        Escrever("Com a bonificação, o(a) funcionário(a) " + fun3.getNome() + " receberá: R$ " + salarioDev);

        double salarioOutros = Areas.OUTROS_DEPARTAMENTOS.calcularSalario(fun4.getSalario());
        Escrever("Com a bonificação, o(a) funcionário(a) " + fun4.getNome() + " receberá: R$ " + salarioOutros);

    }

    public static void Escrever(Object msg){
        System.out.println(msg);
    }

}

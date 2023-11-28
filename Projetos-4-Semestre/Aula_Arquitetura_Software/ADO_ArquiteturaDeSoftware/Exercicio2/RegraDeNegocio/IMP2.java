package Exercicio2.RegraDeNegocio;

public class IMP2 implements Orcamento {
    @Override
        public double calcularImposto(double valorProd){

            double orcamento;

            orcamento = valorProd + 0.15 * 100;

            return orcamento;
        }
}

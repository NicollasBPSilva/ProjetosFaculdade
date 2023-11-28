package Exercicio2.RegraDeNegocio;

public class IMP3 implements Orcamento {
    @Override
        public double calcularImposto(double valorProd){

            double orcamento;

            orcamento = valorProd + 0.25 * 100;

            return orcamento;
        }
}

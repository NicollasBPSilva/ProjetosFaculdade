package Exercicio2.RegraDeNegocio;

public class IMP1 implements Orcamento{
    @Override
        public double calcularImposto(double valorProd){

            double orcamento;

            orcamento = valorProd + 0.10 * 100;

            return orcamento;
        }        
}

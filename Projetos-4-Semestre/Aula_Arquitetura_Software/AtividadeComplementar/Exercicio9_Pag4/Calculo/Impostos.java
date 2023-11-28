package AtividadeComplementar.Exercicio9_Pag4.Calculo;

public enum Impostos implements Orcamento {
    
    IMP1{
    @Override
        public double calcularImposto(double valorProd){

            double orcamento;

            orcamento = valorProd + 0.10 * 100;

            return orcamento;
        }
    },

    IMP2{
        @Override
        public double calcularImposto(double valorProd){

            double orcamento;

            orcamento = valorProd + 0.15 * 100;

            return orcamento;
        }
    },

    IMP3{
        @Override
        public double calcularImposto(double valorProd){

            double orcamento;

            orcamento = valorProd + 0.25 * 100;

            return orcamento;
        }
    };
}

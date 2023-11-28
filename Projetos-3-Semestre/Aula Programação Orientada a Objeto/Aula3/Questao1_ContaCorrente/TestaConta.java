package Questao1_ContaCorrente;

public class TestaConta {
    
    public static void main(String[] args) {
        
        Conta_corrente cc = new Conta_corrente(5000.0, 1500.0);
        Conta_especial cce = new Conta_especial(15000.0, 3500.00);


        cc.saqueConta(200);

        Escrever("Seu saldo é: " + cc.dblSaldo);

       cce.saqueConta(200);

        Escrever("Seu saldo é: " + cce.dblSaldo);


    }

    public static void Escrever(Object msg){
        System.out.println(msg);
    }

}

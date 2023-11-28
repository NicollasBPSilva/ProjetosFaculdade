package Questao1_ContaCorrente;

public class Conta_especial extends Conta_corrente {
    
    private int codConta = 2;
    
    Conta_especial (double saldo, double limite){
        this.dblSaldo = saldo;
        this.dblLimite = limite;
    }

    Conta_especial(){       
    }

    public int getCodConta(){
        return codConta;
    }

    public void setCodConta(int codigo){
        this.codConta = codigo;
    }
    
}

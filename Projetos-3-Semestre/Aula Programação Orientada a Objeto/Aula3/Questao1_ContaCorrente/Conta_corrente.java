package Questao1_ContaCorrente;

public class Conta_corrente {
    
    private int codConta = 1;
    double dblSaldo;
    double dblLimite;
    
    Conta_corrente (double saldo, double limite){
        this.dblSaldo = saldo;
        this.dblLimite = limite;
    }
    
    Conta_corrente(){        
    }

    public static boolean isEspecial(int codConta){
           
        if(codConta == 2){
            return true;
        } else {
            return false;
        }
        
    }

        void saqueConta (double valor){
           
            if(isEspecial(2)){
                dblSaldo -= valor * 1.001;
            } else{
                dblSaldo -= valor * 1.005;
            }
            
        }
    
        void depositoConta (double saldo2){
            dblSaldo += saldo2;
        }


        public int getCodConta(){
            return codConta;
        }
    
        public void setCodConta(int codigo){
            this.codConta = codigo;
        }

}
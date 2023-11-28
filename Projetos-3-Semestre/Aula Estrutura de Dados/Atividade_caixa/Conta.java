package Atividade_caixa;

public class Conta {
    
    private String email;
    private String senha;
    private double saldo;

    Conta(String email, String senha){
        this.email = email;
        this.senha = senha;
        this.saldo = 0;
    }

    Conta(){
        
    }

    public void Sacar(Double opSaque){
        if(saldo > 0){
            setSaldo(saldo - opSaque);
            System.out.println("\nOperação realizada com sucesso.");
        } else {
            System.out.println("\nSaldo insuficiente");
        }
    }

    public void Deposito(Double opDeposito){
        setSaldo(saldo + opDeposito);
        System.out.println("\nOperação realizada com sucesso.");
    }

    // public void transfPix(String user, Double opPix){
    //     for(Conta itens : contas){
    //         if(itens != null){
    //             if(user.equals(itens.getEmail())){
    //                 if(saldo > 0){
    //                     setSaldo(saldo - opPix);
    //                     user.setSaldo(saldo + opPix);
    //                     System.out.println("\nOperação realizada com sucesso.");
    //                 } else {
    //                     System.out.println("\nSaldo insuficiente");
    //                 }
    //             }
    //         }
    //     }   
    // }

    public void verSaldo(){
        System.out.println("\nSeu saldo atual é: R$" + getSaldo());
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    } 

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}

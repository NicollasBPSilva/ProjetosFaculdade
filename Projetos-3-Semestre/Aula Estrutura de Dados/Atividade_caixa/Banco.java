package Atividade_caixa;

public class Banco {
    
    private Conta[] contas;
    private int tamanho;

    public void cadastrarConta(Conta contaBanck){
        for(int i = 0; i <= tamanho; i++){
            contas[i] = contaBanck;
            tamanho ++;
            break;
        }
    }

    public void exibirContas(){
        for(Conta itens : contas){
            if (itens != null) {
                System.out.println(String.format("\nEmail cadastrado: s% | Saldo da conta: R$%s", itens.getEmail(), itens.getSaldo()));
            } else {
                System.out.println("\nNão há contas cadastradas.");
            }
        }
    }

    public boolean isTrue(String login, String password){
        for(Conta itens : contas){
            if(itens != null){
                if(login.equals(itens.getEmail()) && password.equals(itens.getSenha())){
                    return true;
                }   
            } 
        }
        return false;
    }
    
    public Conta[] getContas() {
        return contas;
    }

    public void setContas(Conta[] contas) {
        this.contas = contas;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

}

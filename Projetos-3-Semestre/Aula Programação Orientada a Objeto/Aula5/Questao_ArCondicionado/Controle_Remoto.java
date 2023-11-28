package Aula5.Questao_ArCondicionado;

 class Controle_Remoto {
    
    private double temperatura;
    private double itensidadeVent;
    private double ocilacaoVent;
    private boolean ligado;

    public Controle_Remoto (double temp, double itensidade, double ocilacao){
        this.temperatura = temp;
        this.itensidadeVent = itensidade;
        this.ocilacaoVent = ocilacao;
    }

    public Controle_Remoto(){
    }

    public boolean isLigado(){
        return this.ligado;
    }

    public String status(){
        if(isLigado()){
            return "O ar condicionado está desligado.";
        } else {
            return "O  ar condicionado está ligado.";
        }
    }

    public void ligarDesligar(){
        this.ligado = !this.ligado;
     }

    public double getTemperatura() {
        return temperatura;    
    }

    public double setTemperatura(double temperatura) {
        return this.temperatura = temperatura;
    }

    public double getItensidadeVent() {
        return itensidadeVent;    
    }

    public double setItensidadeVent(double itensidadeVent) {
        return this.itensidadeVent = itensidadeVent;
    }

    public double getOcilacaoVent() {
        return ocilacaoVent;    
    }

    public double setOcilacaoVent(double ocilacaoVent) {
        return this.ocilacaoVent = ocilacaoVent;
    }

}

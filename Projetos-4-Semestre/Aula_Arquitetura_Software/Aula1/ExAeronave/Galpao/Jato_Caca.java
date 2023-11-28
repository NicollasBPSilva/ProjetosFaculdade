package ExAeronave.Galpao;

public class Jato_Caca extends Aeronave{

    private String armamento;

    public Jato_Caca() {
    }

    public Jato_Caca(String nome, int num_Ocupantes, float capacidade_Carga, String armamento) {
        super(nome, num_Ocupantes, capacidade_Carga);
        this.armamento = armamento;
    }

    public String getArmamento() {
        return armamento;
    }

    public void setArmamento(String armamento) {
        this.armamento = armamento;
    }

    @Override
    public String toString() {
        return "Jato de Caça /n[Nome= " + getNome() + " | Número de ocupantes= " + getNum_Ocupantes() + 
        " | Capacidade de carga= " + getCapacidade_Carga() + " | Armamento= " + armamento + "]";
    }
    
}
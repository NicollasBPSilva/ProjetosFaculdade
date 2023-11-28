package ExAeronave.Galpao;

public class Aeronave {
    
    private String nome;
    private int num_Ocupantes;
    private float capacidade_Carga;

    public Aeronave(){

    }

    public Aeronave(String nome, int num_Ocupantes, float capacidade_Carga){
        this.nome = nome;
        this.num_Ocupantes = num_Ocupantes;
        this.capacidade_Carga = capacidade_Carga;
    }

    public float getCapacidade_Carga() {
        return capacidade_Carga;
    }
    public void setCapacidade_Carga(float capacidade_Carga) {
        this.capacidade_Carga = capacidade_Carga;
    }
    public int getNum_Ocupantes() {
        return num_Ocupantes;
    }
    public void setNum_Ocupantes(int num_Ocupantes) {
        this.num_Ocupantes = num_Ocupantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

        @Override
    public String toString() {
        return "Aeronave \n[Nome= " + nome + " | Número de Ocupantes= " + num_Ocupantes + 
        " | Capacidade de carga= " + capacidade_Carga + "]";
    }

}

package ExAeronave.Galpao;


public class Aeronave_Asas_Rotativas extends Aeronave {

    private boolean rotor_Calda;

    public Aeronave_Asas_Rotativas(){
    }

    public Aeronave_Asas_Rotativas(String nome, int num_Ocupantes, float capacidade_Carga, boolean rotor_Calda) {
        super(nome, num_Ocupantes, capacidade_Carga);
        this.rotor_Calda = rotor_Calda;
    }

    public boolean isRotor_Calda() {
        return rotor_Calda;
    }

    public void setRotor_Calda(boolean rotor_Calda) {
        this.rotor_Calda = rotor_Calda;
    }

    @Override
    public String toString() {
        if(rotor_Calda == true){
            return "Aeronave \n[Nome= " + getNome() + " | Número de Ocupantes= " + getNum_Ocupantes() + 
            " | Capacidade de carga= " + getCapacidade_Carga() + "\n Possui asas rotativas? Sim.]";
         } else {
            return "Aeronave \n[Nome= " + getNome() + " | Número de Ocupantes= " + getNum_Ocupantes() + 
            " | Capacidade de carga= " + getCapacidade_Carga() + "\n Possui asas rotativas? Não.]";
         }
    }

}
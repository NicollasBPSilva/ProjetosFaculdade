package ExAeronave.Gerenciamento;

import ExAeronave.Galpao.*;

public class Teste {
    
    public static void main(String[] args) {
        
        Aeronave aero = new Aeronave("Teco teco", 10, 250f);
        Jato_Caca jato = new Jato_Caca("F15", 2, 5f, "2 misseis e uma metralhadora .30");
        Aeronave_Asas_Rotativas rotativo = new Aeronave_Asas_Rotativas
        ("Concorde", 50, 1000f, true);

        Escrever(aero);
        Escrever(jato);
        Escrever(rotativo);

    }

    public static void Escrever(Object msg){
        System.out.println(msg);
    }

}

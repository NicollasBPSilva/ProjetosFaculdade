package Aula8.Questão_massa;

public class Generics <T extends Number> {
    
    T massa;
    final double gravidadeTerra = 9.8;
    final double gravidadeMarte = 3.72;
    
    public Generics(T massa){
        this.massa = massa;
    }
    public Generics(){
    }

    
    Double calcularPesoTerra(T massa){
        return gravidadeTerra * massa.doubleValue();
    }

    Double calcularPesoMarte(T massa){
        return gravidadeMarte * massa.doubleValue() * massa.intValue();
    }

}

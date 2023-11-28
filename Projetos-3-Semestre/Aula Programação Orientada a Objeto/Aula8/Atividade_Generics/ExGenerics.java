package Aula8.Atividade_Generics;

public class ExGenerics {
    
   public static void main(String[] args) {
        MinhaClasse<Integer> inteiro = new MinhaClasse<>(5);
        MinhaClasse<Double> doubleType = new MinhaClasse<>(5.0);

        System.out.println(inteiro.aoQuadrado() + " | " + doubleType.aoQuadrado());
   } 

}

package Aula8.Questão_massa;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Escrever("\n******** Calculando peso entre planetas ********\n");
        Escrever("Insira a massa a ser calculada.");
        int valor = sc.nextInt();

        Generics<Integer> Peso = new Generics<>(valor);
        
        Escrever("");
        Escrever("O peso na Terra seria: " + Peso.calcularPesoTerra(valor));
        Escrever("O peso em Marte seria: " + Peso.calcularPesoMarte(valor));
        Escrever("");

        sc.close();
    }

    public static void Escrever(Object msg){
        System.out.println(msg);
    }
}

package Exercicio3.Exec;

import Exercicio3.Ordenacao.MethodBubble;
import Exercicio3.Ordenacao.MethodInsertion;
import Exercicio3.Ordenacao.MethodSelection;

public class Main {

    public static void main(String[] args) {

        int[] vector1 = {1, 31, 7, 23, 44};
        int[] vector2 = {7, 9, 22, 12, 27};
        int[] vector3 = {5, 10 , 8, 15, 22};

        MethodInsertion ordInsertion = new MethodInsertion();
        ordInsertion.ordenacao(vector1);
        Escrever("\nAbaixo está o vetor ordenado por Inserção:");
        for (int val : vector1) {
           System.out.print(val + " ");
        }

        MethodSelection ordSelection = new MethodSelection();
        ordSelection.ordenacao(vector2);
        Escrever("\nAbaixo está o vetor ordenado por Seleção:");
        for (int val : vector2) {
           System.out.print(val + " ");
        }

        MethodBubble ordBubble = new MethodBubble();
        ordBubble.ordenacao(vector3);
        Escrever("\nAbaixo está o vetor ordenado por Bolha:");
        for (int val : vector3) {
           System.out.print(val + " ");
        }

    }

    public static void Escrever (Object msg){
    	System.out.println(msg);
    }

}

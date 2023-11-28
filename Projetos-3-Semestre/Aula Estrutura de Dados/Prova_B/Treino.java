package Prova_B;

public class Treino {
    
    private Exercicio[] exercicios;
    private int tamanho;

    public Treino() {
        this.exercicios = new Exercicio[5];
        this.tamanho = 0;
    }

    public void adicionar(Exercicio exec) {
        if (this.exercicios.length == tamanho){
            aumentarTamanho();
        } else {
        for (int i = 0; i < this.exercicios.length; i++) {
            if (this.exercicios != null) {
                this.exercicios[tamanho] = exec;
                tamanho++;
                break;
                }
            }
        }
    }

    public void aumentarTamanho() {
        Exercicio novoArray[] = new Exercicio[tamanho * 2];
        for (int i = 0; i < tamanho; i++) {
            novoArray[i] = exercicios[i];
        }
        exercicios = novoArray;
    }

    public void proximo() {
        int posicao = 0;
        for (int i = 0; i < tamanho; i++) {
            System.out.println(String.format("Agora bora fazer: %s", exercicios[posicao].getNome()));
            exercicios[posicao] = null;
            tamanho--;
        }
    } 

    public void exibir() {
        for (Exercicio i : exercicios) {
            if (i != null) {
                System.out.println(i.getNome());
            } else {
                System.out.println("Não há exercicios a serem realizados.");
            }
        }
    }

}

package Prova_B;

public class Exercicio {
    private String nome;
    private int repeticao;
    
    Exercicio(String nome, int repeticao) {
        this.nome = nome;
        this.repeticao = repeticao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setRepeticao (int repeticao){
        this.repeticao = repeticao;
    }

    public int getRepeticao (){
        return repeticao;
    }
}

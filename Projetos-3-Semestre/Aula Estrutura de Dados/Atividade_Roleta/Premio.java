package Atividade_Roleta;

public class Premio {

    private String nome;
    private Premio proximo;
    private Premio anterior;

    Premio(String nome){
        this.nome = nome;
    }

    Premio(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Premio getProximo() {
        return proximo;
    }

    public void setProximo(Premio proximo) {
        this.proximo = proximo;
    }

    public Premio getAnterior() {
        return anterior;
    }

    public void setAnterior(Premio anterior) {
        this.anterior = anterior;
    }

    
}

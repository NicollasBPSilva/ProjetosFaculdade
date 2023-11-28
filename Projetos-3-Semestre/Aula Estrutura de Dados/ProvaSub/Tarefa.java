
public class Tarefa {

    private String descricao;
    private boolean feito;

    Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setFeito (boolean feito){
        this.feito = feito;
    }

    public boolean getFeito (){
        return feito;
    }

}
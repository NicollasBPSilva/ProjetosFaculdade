package ExStrategy.Modelo;

public class Produto {
    private String descricao;
    private double preco, peso;

    public Produto(){

    }

    public Produto(String descricao, double preco, double peso){
        this.descricao = descricao;
        this.preco = preco;
        this.peso = peso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}

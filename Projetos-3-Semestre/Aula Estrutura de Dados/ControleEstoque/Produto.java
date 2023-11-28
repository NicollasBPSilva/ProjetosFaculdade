package ControleEstoque;

public class Produto {
    private String codigo;
    private String nome;
    private String categoria;
    private Double preco;
    private int quantidade;

    public Produto(String codigo, String nome, String categoria, Double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public Double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void removerProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }
}

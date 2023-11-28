package ExLambda;

import java.text.DecimalFormat;

public class Produto {
    private String categoria;
    private double preco;
    DecimalFormat df = new DecimalFormat("R$#.00");

    public Produto(String categoria, double preco) {
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto = " + categoria + ", valor = " + df.format(preco);
    }
    
}

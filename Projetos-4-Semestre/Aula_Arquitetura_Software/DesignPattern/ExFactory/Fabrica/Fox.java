package ExFactory.Fabrica;

public class Fox implements Carro{

    private String modelo;
    private double preco;

    public Fox(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public Fox() {
    }

    @Override
    public String toString() {
        return "Fox [modelo=" + modelo + ", preco=" + preco + "]";
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}

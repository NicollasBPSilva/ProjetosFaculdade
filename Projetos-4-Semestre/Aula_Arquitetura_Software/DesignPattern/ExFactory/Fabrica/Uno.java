package ExFactory.Fabrica;

public class Uno implements Carro{
    
    private String modelo;
    private double preco;

    public Uno(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public Uno() {
    }

    @Override
    public String toString() {
        return "Uno [modelo=" + modelo + ", preco=" + preco + "]";
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

package ExFactory.Fabrica;

public class Jetta implements Carro{
    
    private String modelo;
    private double preco;

    public Jetta(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public Jetta() {
    }

    @Override
    public String toString() {
        return "Jetta [modelo=" + modelo + ", preco=" + preco + "]";
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

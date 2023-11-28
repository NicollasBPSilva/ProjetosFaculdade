package ExFactory.Fabrica;

public class Argo implements Carro{

    private String modelo;
    private double preco;

    public Argo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public Argo() {
    }

    @Override
    public String toString() {
        return "Argo [modelo=" + modelo + ", preco=" + preco + "]";
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

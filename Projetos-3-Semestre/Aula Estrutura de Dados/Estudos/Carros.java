package Estudos;

public class Carros {
    
    private String modelo;
    private String marca;
    private int ano;

    Carros (String modelo, String marca, int ano){
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}

package Aula6.Atividade_Calculadora;

public class sobreCargaConstruct {
    
    private String modelo;
    private String marca;
    private String uso;

    public sobreCargaConstruct(){
    }

    public sobreCargaConstruct(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public sobreCargaConstruct(String marca, String modelo, String uso){
        this.marca = marca;
        this.modelo = modelo;
        this.uso = uso;
    }

    public int Calcular(int a, int b){
        return a + b;
    }

    public double Calcular(double a, double b){
        return a + b;
    }

    
    public String Calcular(String a, String b){
        return a + "" + b;
    }

    public static void main(String[] args) {
        
        sobreCargaConstruct calc1 = new sobreCargaConstruct("optpex", "N100", "Empresarial");
        sobreCargaConstruct calc2 = new sobreCargaConstruct("Zion", "Neo1");

        Escrever(calc1.Calcular(900, 1000));
        Escrever(calc1.Calcular(99.0, 100.1));
        Escrever(calc1.Calcular("Sobrecarga de ", "construtores"));
        
        Escrever("calculadora 1 Marca: " + calc1.marca + " Modelo: " + calc1.modelo + " Uso: " + calc1.uso);
        Escrever("calculadora 2 Marca: " + calc2.marca + " Modelo: " + calc2.modelo);
    }

    public static void Escrever(Object msg) {
        System.out.println(msg);
    }

}

package Aula6.Atividade_Calculadora;

public class Calculadora {
    
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
        Calculadora calc = new Calculadora();

        Escrever(calc.Calcular(1, 1));
        Escrever(calc.Calcular(2.0, 6.1));
        Escrever(calc.Calcular("Vi", "ram?"));
    }

    public static void Escrever(Object msg) {
        System.out.println(msg);
    }
}

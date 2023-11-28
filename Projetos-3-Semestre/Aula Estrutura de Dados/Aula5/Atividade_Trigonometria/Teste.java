package Aula5.Atividade_Trigonometria;

import java.util.Scanner;

public class Teste {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    
        Retangulo retangulo = new Retangulo();
        Triangulo triangulo = new Triangulo();

        Escrever("Informe a altura do retângulo: ");
        retangulo.setAltura(sc.nextDouble());
        Escrever("Informe a base do retângulo: ");
        retangulo.setBase(sc.nextDouble());
        Escrever("A aréa do objeto é: " + retangulo.calcularArea(retangulo));

        Escrever("Informe a altura do triângulo: ");
        triangulo.setAltura(sc.nextDouble());
        Escrever("Informe a base do triângulo: ");
        triangulo.setBase(sc.nextDouble());
        Escrever("A aréa do objeto é: " + triangulo.calcularArea(triangulo));

        sc.close();
    }

    public static void Escrever(Object msg){
        System.out.println(msg);
    }
}

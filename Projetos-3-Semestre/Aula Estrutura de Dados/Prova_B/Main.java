package Prova_B;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean verificarMenu = false;
        Treino exercicios = new Treino();

        do {
            menu();
            int valor = sc.nextInt();

            switch (valor) {

                case 1:
                    System.out.println("Informe o exercicio:");
                    String nome = sc.next();
                    System.out.println("Informe a quantidade de repetições:");
                    int qnt = sc.nextInt();
                    Exercicio treino = new Exercicio(nome, qnt);
                    exercicios.adicionar(treino);
                    break;

                case 2:
                    exercicios.proximo();
                    break;

                case 3:
                    exercicios.exibir();
                    break;

                case 0:
                    System.out.println("Você saiu!!!");
                    verificarMenu = true;
                    break;

                default:
                    System.out.println("Parametros invalidos.");
            }

        } while (verificarMenu != true);

        sc.close();
    }

    public static void menu() {
        Escrever("____________Menu____________");
        Escrever("| O que você deseja fazer? |");
        Escrever("| 1. Adicionar Exercicio.  |");
        Escrever("| 2. Proximo Exercicio.    |");
        Escrever("| 3. Exibir Exercicio.     |");
        Escrever("| 0. Sair.                 |");
        Escrever("|__________________________|");
    }

    public static void Escrever(Object msg) {
        System.out.println(msg);
    }
    
}

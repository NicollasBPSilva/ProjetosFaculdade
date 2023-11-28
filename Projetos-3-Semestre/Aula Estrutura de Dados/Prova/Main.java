package Prova;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean verificarMenu = false;
        PilhaDocumentos pilha = new PilhaDocumentos();

        do {
            menu();
            int valor = sc.nextInt();

            switch (valor) {

                case 1:
                    System.out.println("Digite o título do documento:");
                    String titulo = sc.next();
                    Documento doc1 = new Documento(titulo);
                    pilha.adicionar(doc1);
                    break;

                case 2:
                    pilha.assinar();
                    break;

                case 3:
                    pilha.exibir();
                    break;

                case 0:
                    System.out.println("Você saiu!!!");
                    verificarMenu = true;
                    break;

                default:
                    System.out.println("Parametro invalido.");
            }

        } while (verificarMenu != true);

        sc.close();
    }

    public static void menu() {
        Escrever("");
        Escrever("O que você deseja fazer?");
        Escrever("1. Adicionar documento.");
        Escrever("2. Assinar documento.");
        Escrever("3. Exibir documentos.");
        Escrever("0. Sair");
        Escrever("");
    }

    public static void Escrever(Object msg) {
        System.out.println(msg);
    }
}
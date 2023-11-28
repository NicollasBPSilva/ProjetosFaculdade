package Atividade_Roleta;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Premio roleta = new Premio();
        boolean verificarMenu = false;
        Scanner sc = new Scanner(System.in);

        do {
            Menu();
            int valor = sc.nextInt();

            switch (valor) {

                case 1:
                    System.out.println("\n Informe o premio que deseja adicionar:");
                    String insertNome = sc.next();
                    roleta.adicionar(insertNome);

                break;

                case 2:
                    System.out.println("\n Informe o premio que deseja remover:");
                    String removeNome = sc.next();
                    roleta.remover(removeNome);

                break;

                // case 3:
                //     System.out.println("\n Primeiro informe o premio que deseja alterar, depois, insira o novo premio:");
                //     String antigo = sc.next();
                //     String novo = sc.next();
                //     roleta.alterar(antigo, novo);

                // break;

                // case 4:
                //     System.out.println();
                //     roleta.totalPremios();

                // break;

                case 5:
                    System.out.println();
                    roleta.verPremios();

                break;

                // case 6:
                //     System.out.println();
                //     roleta.rodar();
                    
                // break;

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


    public static void Menu() {
        System.out.println("__________________");
        System.out.println("| Selecione uma opção |");
        System.out.println("| 1. Adicionar Premio. |");
        System.out.println("| 2. Remover Premio. |");
        System.out.println("| 3. Alterar Premio. |");
        System.out.println("| 4. Exibir total de Premios. |");
        System.out.println("| 5. Verificar Premios. |");
        System.out.println("| 6. Roletar. |");
        System.out.println("| 0. Sair |");
        System.out.println("__________________");
    }

}

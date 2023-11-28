import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaDeTarefas listTaks = new ListaDeTarefas();
        boolean verificarMenu = false;
        
        do {
            menu();
            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    Escrever("\nInsira a descrição da tarefa:");
                    String descript = sc.next();
                    Tarefa task1 = new Tarefa(descript);
                    listTaks.adicionarTarefa(task1);
                    break;

                case 2:
                    Escrever("\nInforme o número da tarefa a ser removido:");
                    int val = sc.nextInt();
                    listTaks.removerTarefa(val);
                    break;

                case 3:
                    Escrever("");
                    listTaks.exibirTarefa();
                    break;

                case 4:
                    Escrever("\nInforme o número da tarefa ser marcada:");
                    int marc = sc.nextInt();
                    listTaks.marcarTarefa(marc);
                break;

                case 0:
                    Escrever("\nVocê saiu!!!");
                    verificarMenu = true;
                    break;

                default:
                    Escrever("\nParâmetros inválidos.");
            }

        } while (verificarMenu != true);

        sc.close();
    }

    public static void menu() {
        Escrever("");
        Escrever("====== Lista de Tarefas ======");
        Escrever("| 1. Adicionar               |");
        Escrever("| 2. Remover                 |");
        Escrever("| 3. Exibir                  |");
        Escrever("| 4. Marcar como lido        |");
        Escrever("| 0. Sair.                   |");
        Escrever("|____________________________|");
        Escrever("");
    }

    public static void Escrever(Object msg) {
        System.out.println(msg);
    }
}
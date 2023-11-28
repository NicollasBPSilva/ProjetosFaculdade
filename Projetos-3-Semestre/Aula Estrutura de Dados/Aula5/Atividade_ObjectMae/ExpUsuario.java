package Aula5.Atividade_ObjectMae;

import java.util.Scanner;

public class ExpUsuario {
    
    public static void main(String[] args) {
     
        Menu();

    }

    public static void Menu(){
        Scanner sc = new Scanner(System.in);
        Pessoa arvore = new Pessoa();
        int opcao = -1;

        do{
            Escrever("\n****** Menu ******\n");
            Escrever("1. Adicionar pessoa.\n2. Exibir árvore genealógica.\n0. Sair.");
            Escrever("\n****************\n");
            opcao = sc.nextInt();
            
                switch(opcao){
                    case 1:
                    Escrever("Informe um nome: ");
                    sc.next();
                    adicionarPessoa(arvore, sc.nextLine());
                    break;

                    case 2:
                    imprimirArvore(arvore);
                    break;

                    case 0:
                    Escrever("Você saiu!!");
                    break;

                    default:
                    Escrever("Opção inválida.");
                    break;
                }

        } while(opcao != 0 );
    
        sc.close();
    }

    public static void imprimirArvore(Pessoa p){
        Pessoa pessoa = p;
            
        while(pessoa != null){
            Escrever(pessoa.getNome());
            pessoa = pessoa.getMae();
        }    
        
    }

    public static Pessoa adicionarPessoa(Pessoa p, String nome){
        Pessoa pessoa = p;

        pessoa.setNome(nome);
        pessoa.setMae(pessoa);
        return pessoa;
    }

    public static void Escrever(Object msg){
        System.out.println(msg);
    }
}

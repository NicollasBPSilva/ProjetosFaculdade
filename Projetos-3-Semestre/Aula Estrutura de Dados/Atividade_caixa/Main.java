package Atividade_caixa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean varificarMenu = false;
        Conta novaConta = new Conta();
        Banco banco = new Banco();

        do {
            menu();
            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    Escrever("Informe um e-mail:");
                    String login = sc.next();
                    Escrever("Informe sua senha:");
                    String senha = sc.next();
                    novaConta = new Conta(login, senha);
                    banco.cadastrarConta(novaConta);
                    Escrever("\nConta criada com sucesso!");
                    break;

                case 2:
                    Escrever("Informe seu e-mail:");
                    login = sc.next();
                    Escrever("Informe sua senha:");
                    senha = sc.next();
                     //if(banco.isTrue(login, senha) != false){
                        Escrever("\nLogado com sucesso!");

                        do {
                            menuLogado();
                            opcao = sc.nextInt();
                
                            switch (opcao) {
                
                                case 1:
                                    Escrever("Qual valor do saque?");
                                    Double saque = sc.nextDouble();
                                    novaConta.Sacar(saque);
                                break;
                
                                case 2:
                                    Escrever("Qual valor do depósito?");
                                    Double deposito = sc.nextDouble();
                                    novaConta.Deposito(deposito);
                                break;
                
                                case 3:
                                novaConta.verSaldo();
                                break;

                                // case 4:
                                //     Escrever("Qual valor do PIX?");
                                //     Double pix = sc.nextDouble();
                                //     novaConta.transfPix(pix);
                                // break;
                
                                default:
                                    System.out.println("\nParametros invalidos.");
                            }
                
                        } while ( opcao != 0);
                        
                    // } else {
                    //     Escrever("\nE-mail ou senha inválido!!");
                    // };
                    // break;

                case 0:
                    System.out.println("\nVocê saiu!!!");
                    varificarMenu = true;
                    break;

                default:
                    System.out.println("\nParametros invalidos.");
            }
            
        } while (varificarMenu != true);
        
        sc.close();
    }

    public static void menu(){
        Escrever(""); 
        Escrever("**** Programa de caixa ****");
        Escrever("* 1. Criar conta.         *");
        Escrever("* 2. Login.               *");
        Escrever("* 0. Sair                 *");
        Escrever("***************************");
        Escrever("");
    }

    public static void menuLogado(){
        Escrever("");
        Escrever("1. Sacar.");
        Escrever("2. Depositar.");
        Escrever("3. Ver saldo.");
        Escrever("4. Pix.");
        Escrever("0. Sair");
        Escrever("");
    }

    public static void Escrever(Object msg){
        System.out.println(msg);
    }
}

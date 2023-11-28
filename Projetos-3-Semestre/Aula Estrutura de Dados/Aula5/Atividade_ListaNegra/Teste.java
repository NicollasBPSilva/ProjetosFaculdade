package Aula5.Atividade_ListaNegra;

import java.util.Date;
import java.util.Scanner;


public class Teste {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		ListaNegra listaNegra = new ListaNegra();
		int valor;

		do{
			menu();
			valor = sc.nextInt();

			switch (valor) {
			case 1:
				System.out.println("\nDigite o nome da pessoa: ");
				String nome = sc.next();
				System.out.println("\nDigite o motivo: ");
				String motivo = sc.next();
				Pessoa novaPessoa = new Pessoa(nome, motivo, inclusao());
				listaNegra.adicionarPessoas(novaPessoa);
				break;

			case 2:
				listaNegra.removerPessoa();
				break;

			case 3:
				listaNegra.exibir();
				break;

			case 0:
				Escrever("Você saiu!!!");;
				break;

			default:
				Escrever("Parametros inválidos.");
			}
		
		} while (valor != 0);

		sc.close();
	}

	private static Date inclusao() {
		return null;
	}

	public static void menu(){
		Escrever("\n");
		Escrever("Selecione uma opção.");
		Escrever(" [1] Alterar pessoa.");
		Escrever(" [2] Remover pessoa.");
		Escrever(" [3] Exibir pessoas.");
		Escrever(" [0] Sair.");
		Escrever("\n");
	}
	
	public static void Escrever(Object msg){
		System.out.println(msg);
	}
}

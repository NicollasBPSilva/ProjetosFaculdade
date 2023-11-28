package main;

import java.util.Scanner;

import cursos.GraduacaoPresencial;
import cursos.Cursos;
import cursos.GraduacaoEad;
import cursos.PosGraduacao;
import fabricaCursos.EscolhendoCurso;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			
			Menu();

			int opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				EscolhendoCurso.escolhaCurso(Cursos.GRADUACAOPRESENCIAL);
				GraduacaoPresencial op1 = new GraduacaoPresencial();
				String docPresencial = op1.diplomaRequerido();
				Escrever("Para este curso, é necessário ter o diploma: " + docPresencial);
				break;
			case 2:
				EscolhendoCurso.escolhaCurso(Cursos.GRADUACAOEAD);
				GraduacaoEad op2 = new GraduacaoEad();
				String docEAD = op2.diplomaRequerido();
				Escrever("Para este curso, é necessário ter o diploma: " + docEAD);
				break;
			case 3:
				EscolhendoCurso.escolhaCurso(Cursos.POSGRADUACAO);
				PosGraduacao op3 = new PosGraduacao();
				String docPos = op3.diplomaRequerido();
				Escrever("Para este curso, é necessário ter o diploma: " + docPos);
				break;
			case 4:
				Escrever("Você saiu!!");
				return;
			default:
				Escrever("A opção " + opcao + " é inválida.");
				break;
			}

		}
	}

	public static void Menu(){
		Escrever("\n _______Selecione um curso_______");
		Escrever("|                                |");
		Escrever("| 1. Graduação Presencial        |");
		Escrever("| 2. Graduação à distância (EAD) |");
		Escrever("| 3. Pós-graduação               |");
		Escrever("| 4. Sair                        |");
		Escrever("|________________________________|\n");
	}

	public static void Escrever (Object msg){
    	System.out.println(msg);
    }

}

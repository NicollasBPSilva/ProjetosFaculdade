package ExAluno.Cadastro;

import ExAluno.Gerencimaneto.*;

public class Cadastrar {
    
    public static void main(String[] args) {
        
        Aluno novoAluno = new Aluno("Jorge Queiroz", 56789);
        AlunoGraduacao consultarAluno = new AlunoGraduacao("Maria Joaquina", 678994, "Campos do Jordão");


        Escrever(novoAluno);
        Escrever(consultarAluno);
    }

    public static void Escrever(Object msg){
        System.out.println(msg);
    }

}

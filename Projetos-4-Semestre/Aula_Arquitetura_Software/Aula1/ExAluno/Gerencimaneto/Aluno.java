package ExAluno.Gerencimaneto;

public class Aluno {

    private String nome;
    private int ra;

    public Aluno (){

    }

    public Aluno (String nome, int ra){
        this.nome = nome;
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getRa() {
        return ra;
    }
    public void setRa(int rA) {
        ra = rA;
    }

    @Override
    public String toString() {
        return "Aluno: \nNome= " + nome + "\nRA= " + ra + "\n";
    }

}
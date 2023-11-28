package ExAluno.Gerencimaneto;

public class AlunoGraduacao extends Aluno {
    
    private String unidade;

    public AlunoGraduacao(){

    }

    public AlunoGraduacao(String nome, int RA, String unidade){
        super(nome, RA);
        this.unidade = unidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    @Override
    public String toString() {
        return "Aluno: \nNome= " + getNome() + "\nRA= " + getRa() + "\nUnidade= " + unidade + "\n";
    }
    
}

package ExemploProjeto1.Heranca;

public class Funcionario extends PessoaFisica{
    
    private int matricula;

    Funcionario(){

    }

    Funcionario(String nome, long CPF, int matricula){
        super(nome, CPF);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Funcionario \n[Nome= " + getNome() + "\nCPF= " + getCPF()+ "\nMatricula= " + matricula + "]\n";
    }

}

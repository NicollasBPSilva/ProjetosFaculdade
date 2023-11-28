package ExemploProjeto1.Heranca;

public class PessoaFisica extends Pessoa {

    private long CPF;

    public PessoaFisica(){
        
    }

    public PessoaFisica(String nome, long CPF){
        super(nome);
        this.CPF = CPF;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long cPF) {
        CPF = cPF;
    }

    @Override
    public String toString() {
        return "PessoaFisica \n[Nome= "+ getNome() + "\nCPF= " + CPF + "]\n";
        //return "PessoaFisica [" + super.getNome() + "\nCPF=" + CPF + "]";
    }

}
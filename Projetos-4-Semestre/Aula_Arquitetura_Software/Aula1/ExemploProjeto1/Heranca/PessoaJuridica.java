package ExemploProjeto1.Heranca;

public class PessoaJuridica extends Pessoa {
    
    private long CNPJ;

    PessoaJuridica(){
        
    }

    public long getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(long cNPJ) {
        CNPJ = cNPJ;
    }

    @Override
    public String toString() {
        return "PessoaJuridica \n[Nome= "+ getNome() + "\nCNPJ= " + CNPJ + "]\n";
    }
    
}

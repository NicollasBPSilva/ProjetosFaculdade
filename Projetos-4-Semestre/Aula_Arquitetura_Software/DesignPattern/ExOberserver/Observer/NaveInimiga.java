package ExOberserver.Observer;

public class NaveInimiga implements Observer {
    
    private String nome;

    public NaveInimiga(String nome, Subject subj) {
        this.nome = nome;
        subj.addObservador(this);
        
    }

    @Override
    public void atualizar(Acao acao) {
        System.out.println(this.nome + " " + acao);
    }

}

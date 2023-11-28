package ExOberserver.Observer;

import java.util.ArrayList;
import java.util.List;

public class NaveJogador implements Subject{
    
    private String nome;
    private Acao acao;
    private List<Observer> lista;

    public NaveJogador(String nome) {
        this.nome = nome;
        this.lista = new ArrayList<>();
    }

    @Override
    public void addObservador(Observer observer) {
        lista.add(observer);
    }

    @Override
    public void setAcao(Acao acao) {
        this.acao = acao;
        notificar();
    }

    @Override
    public void notificar() {
        for(Observer obs : lista){
            obs.atualizar(acao);
        }
    }    

}

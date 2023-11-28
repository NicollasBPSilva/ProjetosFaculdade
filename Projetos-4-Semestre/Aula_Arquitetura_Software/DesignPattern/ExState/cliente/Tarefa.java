package ExState.cliente;

import ExState.estado.*;

public class Tarefa {
    private String nome;
    private String descricao;
    private Estados estado;
    
    public Tarefa(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.estado = new Pendente(this);
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setEstado(Estados estado) {
        this.estado = estado;
        System.out.println(this.estado);
    }
    
    public Estados getEstado() {
        return estado;
    }
    
    protected void requererAtrasada() {
        estado.atrasada();
    }

    protected void requererConcluida() {
        estado.concluida();
    }

    protected void requererPendente() {
        estado.pendente();
    }

    @Override
    public String toString() {
        return "" + nome;
    }

}

package ExState.estado;

import ExState.cliente.Tarefa;

public class Pendente implements Estados{

    private Tarefa tarefa;
    private String msg = "Status: Tarefa pendente.";

    public Pendente(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasada() {
        tarefa.setEstado(new Atrasada(tarefa));        
    }

    @Override
    public void concluida() {
        tarefa.setEstado(new Concluida(tarefa));
    }

    @Override
    public void pendente() {
        System.out.println(msg);
    }

    @Override
    public String toString() {
        return "Tarefa: " + tarefa + " " + msg;
    }

}

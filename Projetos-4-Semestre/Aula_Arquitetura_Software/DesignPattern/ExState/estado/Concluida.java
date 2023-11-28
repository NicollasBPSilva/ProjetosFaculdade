package ExState.estado;

import ExState.cliente.Tarefa;

public class Concluida implements Estados{

    private Tarefa tarefa;
    private String msg = "Status: Tarefa concluida.";

    public Concluida(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasada() {
        System.out.println(msg);         
    }

    @Override
    public void concluida() {
        System.out.println(msg);        
    }

    @Override
    public void pendente() {
        tarefa.setEstado(new Pendente(tarefa));
    }

    @Override
    public String toString() {
        return "Tarefa: " + tarefa + " " + msg;
    }
    
}

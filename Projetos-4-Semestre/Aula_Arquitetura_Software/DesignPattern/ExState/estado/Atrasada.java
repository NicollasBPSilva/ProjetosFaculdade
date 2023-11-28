package ExState.estado;

import ExState.cliente.Tarefa;

public class Atrasada implements Estados{

    private Tarefa tarefa;
    private String msg = "Status: Tarefa atrasada.";

    public Atrasada(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasada() {
        System.out.println(msg);
        
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

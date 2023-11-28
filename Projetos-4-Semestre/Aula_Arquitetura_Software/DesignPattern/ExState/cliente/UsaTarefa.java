package ExState.cliente;

public class UsaTarefa {
    
    public static void main(String[] args) {
        
        Tarefa tarefa = new Tarefa ("Xpto", "Elicitar requisito");
        
        tarefa.requererPendente();
        tarefa.requererAtrasada();
        tarefa.requererConcluida();
    }
    
}

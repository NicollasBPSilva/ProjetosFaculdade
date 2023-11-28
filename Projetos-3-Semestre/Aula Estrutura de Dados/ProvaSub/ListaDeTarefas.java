public class ListaDeTarefas {
    
    private Tarefa[] tarefas;
    private int tamanho;



    ListaDeTarefas() {
        this.tarefas = new Tarefa[5];
        this.tamanho = 0;
    }

    public void adicionarTarefa(Tarefa task) {
        if (this.tarefas.length == tamanho){
            aumentarTamanho();
        } else {
        for (int i = 0; i < this.tarefas.length; i++) {
            if (this.tarefas != null) {
                this.tarefas[tamanho] = task;
                tamanho++;
                break;
                }
            }
        }
    }

    public void removerTarefa(int indece) {
         int posicao = indece - 1;
        
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("\nA posição informada é inválida.");
            return;
        }
        
        for (int i = posicao; i < tamanho - 1; i++) {
            tarefas[i] = tarefas[i + 1];
        }
        
        tarefas[tamanho - 1] = null;
        tamanho--;
    }

    public void aumentarTamanho() {
        Tarefa vetorTemporario[] = new Tarefa[tamanho * 2];
        for (int i = 0; i < tamanho; i++) {
            vetorTemporario[i] = tarefas[i];
        }
        tarefas = vetorTemporario;
    }

    public void exibirTarefa() {
        for (Tarefa i : tarefas) {
            if (i != null) {
                System.out.println(String.format("\n[%s] %s", i.getFeito() ? "x" : " ", i.getDescricao()));
            } 
        }

    }

    public void marcarTarefa(int indece) {      
       int posicao = indece - 1;
       
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("\nPosição informada não é inválida.");
            return;
        }
        
        Tarefa veficicar = tarefas[posicao];
        veficicar.setFeito(true);
    }

}
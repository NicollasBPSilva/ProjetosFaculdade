package Aula5.Atividade_ListaNegra;

public class ListaNegra {

	public Pessoa[] listaPessoas;
	public int tamanho;
	
	ListaNegra() {
		
	}

	public void adicionarPessoas(Pessoa pessoa) {
		for (int i = 0; i < this.listaPessoas.length; i++) {
			if (this.listaPessoas != null) {
				this.listaPessoas[tamanho] = pessoa;
				tamanho++;
				break;
			}
        }
	}
	
	public void removerPessoa() {
		int posicao = tamanho - 1;

        for (int i = 0; i < tamanho; i++) {
            System.out.println(String.format("Pessoa %s removida com sucesso!!", listaPessoas[posicao].getNome()));
            listaPessoas[posicao] = null;
            tamanho--;
            break;
        }
	}
	
	public void exibir() {
		for (Pessoa i : listaPessoas) {
            if (i != null) {
                System.out.println(String.format("\nNome:  %s\nMotivo:  %s\nData de inclusão:  %s", 
				i.getNome(), i.getMotivo(), i.getInclusao()));
            } else {
                System.out.println("Não há pessoas na lista.");
            }
		}
	}
}

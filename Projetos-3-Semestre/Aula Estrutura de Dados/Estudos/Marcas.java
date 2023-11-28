package Estudos;

public class Marcas {
    
    private Carros[] veiculos;
    private int tamanho;

    public Marcas(){
        this.veiculos = new Carros[3];
        this.tamanho = 0;
    }

    public void aumentarTamanho(){
        Carros temp[] = new Carros[tamanho*2];
        for(int i = 0; i < tamanho; i++){
            temp[i] = veiculos[i];
        }
        veiculos = temp;
    }

    public void adicionar(Carros carro){
        if(this.veiculos.length == tamanho){
            aumentarTamanho();
        } else {
            for(int i = 0; i < this.veiculos.length; i ++){
                if(this.veiculos != null){
                    this.veiculos[tamanho] = carro;
                    tamanho++;
                    break;
                }
            }
        }
    }

    public void remover(String carro){
		int posicao = tamanho - 1;

        for (int i = 0; i < tamanho; i++) {
            System.out.println(String.format("Carro %s removido com sucesso!!", veiculos[posicao].getModelo()));
            veiculos[posicao] = null;
            tamanho--;
            break;
        }
	}

    public void exibir(){
        for(Carros c : veiculos){
            if(c != null){
                System.out.println(String.format("\nMarca: %s\nModelo: %s\nAno de fabricação: %s\n", c.getMarca(), c.getModelo(), c.getAno()));
            } else {
                System.out.println("Não há carros na fila");
            }
        }
    }
}

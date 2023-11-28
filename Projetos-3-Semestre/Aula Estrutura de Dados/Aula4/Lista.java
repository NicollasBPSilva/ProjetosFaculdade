package Aula4;

public class Lista <T> extends EstruturaEstatica <T>{
    
    public Lista(int capacidade){
        super(capacidade);
    }

    public Lista(){
        super();
    }

    public boolean adiciona(T elemento){
        return super.adicionar(elemento);
    }

    public boolean adiciona(int posicao, T elemento){
        return super.adicionar(posicao, elemento);
    }
}

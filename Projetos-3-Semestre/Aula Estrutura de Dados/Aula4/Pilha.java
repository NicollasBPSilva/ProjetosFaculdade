package Aula4;

public class Pilha<T> extends EstruturaEstatica<T>{
    
    public Pilha(){
        super();
    }

    public Pilha (int capacidade){
        super(capacidade);
    }

    public void empilhar(T elemento){
        super.adicionar(elemento);
    }

    public T topo(){
        if(this.verificarVazio()){
            return null;
         } else {
            return this.elementos[tamanho-1];
        }
    }

    public T desempilha(){
        if(this.verificarVazio()){
            return null;
        } else {
            T elemento = this.elementos[tamanho-1];
            tamanho--;
            return elemento;
        }
    }
}

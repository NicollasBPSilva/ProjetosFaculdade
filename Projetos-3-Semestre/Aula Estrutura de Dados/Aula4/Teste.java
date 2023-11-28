package Aula4;

import java.util.Stack;

public class Teste {
    
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();
        
        for(int i = 0; i <= 10; i++){
            pilha.empilhar(i);
        }
        
        Escrever(pilha);
        Escrever("Tamanho da pilha é: " + pilha.tamanho());
        
        Escrever(pilha);
        Escrever(pilha.verificarVazio());
        pilha.empilhar(1);
        Escrever(pilha);
        Escrever(pilha.verificarVazio());
        
        Escrever(pilha.topo());
        Escrever(pilha);
        pilha.empilhar(1);
        pilha.empilhar(2);
        pilha.empilhar(3);
        Escrever(pilha.topo());
        Escrever(pilha);
        
        pilha.empilhar(1);
        pilha.empilhar(2);
        pilha.empilhar(3);
        Escrever(pilha);
        Escrever("Desempilhar elemento " + pilha.desempilha());
        Escrever(pilha);
        
        
        
        Stack<Integer> stack = new Stack<Integer>();
        
        Escrever(stack.isEmpty());
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        Escrever(stack.size());

        Escrever(stack);
        Escrever(stack.peek());
        Escrever(stack.pop());
        Escrever(stack);
    }
    
    public static void Escrever(Object msg){
        System.out.println(msg);
    }
}

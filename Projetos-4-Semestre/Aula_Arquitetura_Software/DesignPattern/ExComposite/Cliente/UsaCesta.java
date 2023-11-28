package ExComposite.Cliente;

import ExComposite.Composite.*;

public class UsaCesta {
      
   public static void main(String[] args) {
         
      Composite cesta = new Composite();
      Component prod1 = new Leaf("Caneca", 43.12);
      Component prod2 = new Leaf("Café", 18.50);
      Component prod3 = new Leaf("Leite", 12.80);
      cesta.adicionar(prod3);
      cesta.adicionar(prod2);
      cesta.adicionar(prod1);

      Escrever(cesta);
      Escrever("Valor total: " + cesta.getPreco());

      Composite caixaFrutas = new Composite();
      Component prod4 = new Leaf("Morango", 5.40);
      Component prod5 = new Leaf("Morango", 5.40);
      Component prod6 = new Leaf("Morango", 5.40);
      Component prod7 = new Leaf("Morango", 5.40);
      caixaFrutas.adicionar(prod4);
      caixaFrutas.adicionar(prod5);
      caixaFrutas.adicionar(prod6);
      caixaFrutas.adicionar(prod7);

      cesta.adicionar(caixaFrutas);

      Escrever(caixaFrutas);
      Escrever("Valor da caixa: " + caixaFrutas.getPreco());
   }

   public static void Escrever (Object msg){
      System.out.println(msg);
   }
}

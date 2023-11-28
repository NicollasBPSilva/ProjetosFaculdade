package ExLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class UsaLista {
    
    public static void main(String[] args) {
   
        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Bebidas", 43.3));
        lista.add(new Produto("Higiene", 12.8));
        lista.add(new Produto("Alimento", 55.92));

        Consumer<Produto> consumer = new Consumer<>() {
            @Override
            public void accept(Produto p) {
                double pd = p.getPreco() * 0.8;
                p.setPreco(pd);
                System.out.println(p);
            }
        };

        lista.forEach(consumer);

    }

}

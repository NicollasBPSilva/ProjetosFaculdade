package ExClassesInternas;

import ExClassesInternas.Externa.Interna;

public class Main {
    
    public static void main(String[] args) {
        
        Externa externa = new Externa();

        Interna interna = externa.new Interna();

        interna.exibir();
        externa.exibir();

    }

}

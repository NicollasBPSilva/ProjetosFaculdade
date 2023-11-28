package ExClassesAnonimas2;

public class Main {
    
    public static void main(String[] args) {
        
        Exibir exibir = new Exibir() {

            @Override
            public void exibirNome() {
                System.out.println("Nico");               
            }

            @Override
            public void exibirSobrenome() {
                System.out.println("Mlk loco");                
            }

        };

        exibir.exibirNome();
        exibir.exibirSobrenome();

    }

}

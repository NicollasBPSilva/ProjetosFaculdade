package ExInterfaceFuncional;

public class Main {
    
    public static void main(String[] args) {
        
        /*
        Classe anonima

        NomeCompleto nome = new NomeCompleto() {
            @Override
            public String getNome() {
                return "Nicollas Bruno";
            }            
        };
        
        nome.exibir(nome.getNome());
        */
        
        //Metodo de implementar utilizando lambda

        NomeCompleto nome = () -> "Nicollas Bruno";
        nome.exibir(nome.getNome());         
        
    }
    
}

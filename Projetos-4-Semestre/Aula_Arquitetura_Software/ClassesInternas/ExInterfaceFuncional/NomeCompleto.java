package ExInterfaceFuncional;

@FunctionalInterface
public interface NomeCompleto {

    public String getNome();
    
    default void exibir(String nome){
        System.out.println(nome.replace(" ", "\n"));
    }
    
}
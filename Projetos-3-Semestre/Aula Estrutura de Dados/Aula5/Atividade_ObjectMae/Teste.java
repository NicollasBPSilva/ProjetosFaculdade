package Aula5.Atividade_ObjectMae;

public class Teste {

    public static void main(String[] args) {
    
        /* Modelo 1
        Pessoa eu = new Pessoa("Nicollas");
        Pessoa mae = new Pessoa("Mirian");
        Pessoa vo = new Pessoa("Ana");
        Pessoa bisa = new Pessoa("Maria");
        Pessoa tatara = new Pessoa("Josefa");
                
        eu.setMae(mae);
        mae.setMae(vo);
        vo.setMae(bisa);
        bisa.setMae(tatara);
        */



    // Modelo 2
    Pessoa eu = new Pessoa("Nicollas",
        new Pessoa("Mirian",
            new Pessoa("Ana",
                new Pessoa("Maria",
                    new Pessoa("Josefa", null)))));

        Escrever("Nome da tataravó: ");            
        imprimirTatara(eu);
        Escrever("");

        Escrever("Sua Árvore Genealógica: ");
        imprimirArvore(eu);
        Escrever("");

        }

        public static void imprimirTatara(Pessoa eu){
            String arvoreGenealogica = eu.getMae().getMae().getMae().getMae().getNome();
            System.out.println(arvoreGenealogica);
        }

        public static void imprimirArvore(Pessoa eu){
            Pessoa pessoa = eu;
            
            while(pessoa != null){
                System.out.println(pessoa.getNome());
                pessoa = pessoa.getMae();
            }    
        }
        
        public static void Escrever(Object msg){
            System.out.println(msg);
        }
}

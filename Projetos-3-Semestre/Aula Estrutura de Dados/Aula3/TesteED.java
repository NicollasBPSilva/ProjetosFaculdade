package Aula3;

public class TesteED {
    public static void main(String[] args) {
        VetorObjeto vetor = new VetorObjeto(5);

        Contato c1 = new Contato("Claudio", "1234-4321", "Claudinha99@gmail.com");
        Contato c2 = new Contato("Daniel", "6789-9876", "Dandanmilgrau@gmail.com");
        Contato c3 = new Contato("Miguel", "5643-3465", "Miguelzin_delas@gmail.com");

        try {
            vetor.adiciona(c1);
            vetor.adiciona(c2);
            vetor.adiciona(c3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Escrever("Tamanho do vetor: " + vetor.tamanho());

        Escrever(vetor);
    }

    public static void Escrever (Object msg){
        System.out.println(msg);
    }

}

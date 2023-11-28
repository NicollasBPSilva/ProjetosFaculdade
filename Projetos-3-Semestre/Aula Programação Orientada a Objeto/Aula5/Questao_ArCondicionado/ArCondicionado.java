package Aula5.Questao_ArCondicionado;

public class ArCondicionado {
    
    public static void main(String[] args) {
        
        Controle_Remoto controler = new Controle_Remoto(22, 5, 0);

        Escrever(controler.status());

        controler.ligarDesligar();

        Escrever(controler.status());

        Escrever("A temperatura atual é: ");
        controler.getTemperatura();


    }




    public static void Escrever (Object msg){
        System.out.println(msg);
    }

}

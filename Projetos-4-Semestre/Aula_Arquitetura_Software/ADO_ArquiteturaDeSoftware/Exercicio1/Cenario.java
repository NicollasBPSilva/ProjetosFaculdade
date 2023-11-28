package Exercicio1;

public class Cenario extends Thread {
        
        @Override
        public void run(){
            Singleton singleton = Singleton.getObject();
            System.out.println(singleton);  
        }

    public static void main(String[] args) {
        
        Cenario cenario1 = new Cenario();
        Cenario cenario2 = new Cenario();
          
        cenario1.start();
        cenario2.start();

    } 

}
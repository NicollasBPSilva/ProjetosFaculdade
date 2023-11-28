package ExSingleton;

public class Main extends Thread {
    
    @Override
    public void run (){
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);
    }
    
    public static void main(String[] args) {
                
        Main t1 = new Main();
        Main t2 = new Main();
        Main t3 = new Main();

        //Iniciar Thread
        t1.start();
        t2.start();
        t3.start();

    }
}

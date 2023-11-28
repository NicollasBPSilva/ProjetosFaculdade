package ExSingleton;

public class Singleton {
    
    //Lazy singleton (Não recomendado para ambientes multiThreads)
    //private static Singleton singleton;

    private static Singleton singleton = new Singleton();
    

    private Singleton (){

    }

    public static Singleton getInstance(){
        //Em caso de lazy singleton (Não recomendado para ambientes multiThreads)
        /*if(singleton == null){
           singleton = new Singleton();
        }*/
        return singleton;
    }
}

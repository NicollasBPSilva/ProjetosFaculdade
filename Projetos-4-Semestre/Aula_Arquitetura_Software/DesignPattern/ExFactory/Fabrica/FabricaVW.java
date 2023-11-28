package ExFactory.Fabrica;

public class FabricaVW implements Fabrica{
    
    @Override
    public Carro factoryMethod(Modelos modelo) {

        if(modelo.equals(Modelos.Jetta)){
            return new Jetta("TSI", 45000);
        }   else if(modelo.equals(Modelos.Fox)){
            return new Fox("Fox Urban", 200000);
        }
        return null;
    }

}

package ExFactory.Fabrica;

public class FabricaFIAT implements Fabrica {
    
    @Override
    public Carro factoryMethod(Modelos modelo) {

        if(modelo.equals(Modelos.Argo)){
            return new Argo("Attack", 67000);
        }   else if(modelo.equals(Modelos.Uno)){
            return new Uno("Uno com escada", 35000);
        }
        return null;
    }

}

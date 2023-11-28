package ExFactory.Cliente;

import ExFactory.Fabrica.*;

public class UsaFabrica {

    public static void main(String[] args) {
        
        Fabrica f;
        Carro c;
        int opc = 1;
            
        if(opc == 1){
            f = new FabricaFIAT();
            c = f.factoryMethod(Modelos.Argo);
            System.out.println(c.getPreco());
        } else if(opc == 2){
            f = new FabricaVW();
            c = f.factoryMethod(Modelos.Jetta);
            System.out.println(c.getPreco());
        }
    }

}
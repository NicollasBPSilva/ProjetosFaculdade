package ExStrategy.Cliente;

import ExStrategy.Modelo.*;
import ExStrategy.Strategy.*;

public class Loja {

    public static void main(String[] args) {

        Produto p1 = new Produto("Geladeira", 4000, 80);
        Produto p2 = new Produto("Ar condicionado", 2800, 8);

        /*
        CalcularFreteEmp e = new XPTO ();
        double frete = e.calcularFrete(p1.getPeso());*/

        double frete = Empresas.XPTO.calcularFrete(p1.getPeso());
        System.out.println(frete);

        double frete2 = Empresas.ABC.calcularFrete(p1.getPeso());
        System.out.println(frete2);

        double frete3 = Empresas.CBA.calcularFrete(p1.getPeso());
        System.out.println(frete3);

        double freteTest = Empresas.XPTO.calcularFrete(p2.getPeso());
        System.out.println(freteTest);
    }

}

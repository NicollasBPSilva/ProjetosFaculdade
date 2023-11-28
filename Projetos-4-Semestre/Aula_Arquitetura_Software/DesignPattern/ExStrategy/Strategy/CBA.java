package ExStrategy.Strategy;

public class CBA implements CalcularFreteEmp {

    @Override
    public double calcularFrete(double peso) {
       
        double frete;

        if (peso <= 5) {
            frete = 8.5;
        } else if (peso <= 10) {
            frete = 13.50;
        } else {
            frete = 23.78;
        }

        return frete;
    }
    
}

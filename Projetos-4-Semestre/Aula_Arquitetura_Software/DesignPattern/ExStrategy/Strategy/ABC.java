package ExStrategy.Strategy;

public class ABC implements CalcularFreteEmp{

    @Override
    public double calcularFrete(double peso) {
        
        double frete;
        
        if (peso <= 5) {
            frete = 4.9;
        } else if (peso <= 10) {
            frete = 10.05;
        } else {
            frete = 18.56;
        }

        return frete;
    }
    
}

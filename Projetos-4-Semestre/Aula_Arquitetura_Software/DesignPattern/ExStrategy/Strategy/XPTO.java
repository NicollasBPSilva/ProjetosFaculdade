package ExStrategy.Strategy;

public class XPTO implements CalcularFreteEmp{
    
    @Override
    public double calcularFrete(double peso){
        
        double frete = 0;

        if (peso <= 5) {
            frete = 6.5;
        } else if (peso <= 10) {
            frete = 12.32;
        } else {
            frete = 20;
        }
        
        return frete;
    }
    
}

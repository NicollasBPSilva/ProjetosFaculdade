package ExStrategy.Strategy;

public enum Empresas implements CalcularFreteEmp{

    XPTO{
        
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
    },

    ABC{
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
    },

    CBA{
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
    };   
}
package CalcSalario.Departamentos;

public enum Areas implements CalcSalarioFuncionarios {

    DESENVOLVIMENTO{
        @Override
        public double calcularSalario(double salario) {
            
            double novoSalario;
            
            novoSalario = salario + 100 * 0.05;
    
            return novoSalario;
        }
    },

    GERENCIA{
        @Override
        public double calcularSalario(double salario) {
            
            double novoSalario;
            
            novoSalario = salario + 100 * 0.06;
    
            return novoSalario;
        }
    }, 

    OUTROS_DEPARTAMENTOS{
        @Override
        public double calcularSalario(double salario) {
            
            double novoSalario;       
    
            novoSalario = salario + 100 * 0.03;
    
            return novoSalario;
        }
    }, 
    
    SUPORTE{
        @Override
        public double calcularSalario(double salario) {
                
            double novoSalario;
                
            novoSalario = salario + 100 * 0.04;
        
            return novoSalario;
        }
    };
}

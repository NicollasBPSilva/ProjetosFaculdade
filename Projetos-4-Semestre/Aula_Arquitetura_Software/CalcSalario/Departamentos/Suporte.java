package CalcSalario.Departamentos;

public class Suporte implements CalcSalarioFuncionarios {
    
    @Override
    public double calcularSalario(double salario) {
        
        double novoSalario;
        
            novoSalario = salario * 0.04;

        return novoSalario;
    }
}

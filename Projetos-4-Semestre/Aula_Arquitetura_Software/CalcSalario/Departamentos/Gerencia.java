package CalcSalario.Departamentos;

public class Gerencia implements CalcSalarioFuncionarios {
    
    @Override
    public double calcularSalario(double salario) {
        
        double novoSalario;
        
        novoSalario = salario * 0.06;

        return novoSalario;
    }
}

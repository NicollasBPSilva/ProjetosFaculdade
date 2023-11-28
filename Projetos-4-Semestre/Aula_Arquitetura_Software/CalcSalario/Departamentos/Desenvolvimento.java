package CalcSalario.Departamentos;

public class Desenvolvimento implements CalcSalarioFuncionarios {
 
    @Override
    public double calcularSalario(double salario) {
        
        double novoSalario;
        
            novoSalario = salario * 0.05;

        return novoSalario;
    }
}

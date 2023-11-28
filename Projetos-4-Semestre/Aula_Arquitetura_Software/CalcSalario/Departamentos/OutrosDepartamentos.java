package CalcSalario.Departamentos;

public class OutrosDepartamentos implements CalcSalarioFuncionarios {
    
    @Override
    public double calcularSalario(double salario) {
        
        double novoSalario;       

        novoSalario = salario * 0.03;

        return novoSalario;
    }
}

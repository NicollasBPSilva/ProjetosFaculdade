package Aula5.Atividade_Trigonometria;

class Trigonometria {

    public double calcularArea(Retangulo forma){
       double calcular = forma.getAltura() * forma.getBase();

        return calcular;
    }

    public double calcularArea(Triangulo forma){
        double calcular = (forma.getAltura() * forma.getBase())/2;
 
         return calcular;
     }
}

package Aula2;
import java.util.*;

class Aula1POO {
    
    public static void main(String[] args){
                    
      Scanner sc = new Scanner(System.in);

        escrever("Informe o valor a ser investido no periodo de 12 meses: \n");
        
        double val_investe = sc.nextInt();   

        escrever("Informe a taxa de juros mensal: \n");

         double taxa_juros = sc.nextDouble();

        escrever(Investimento(val_investe, taxa_juros));

      sc.close();
    }

    public static double Investimento(double val, double juros){
        double invest = 0;
        juros = juros/100;
        int mes = 0;
        while(mes < 13){
            invest = invest + val*juros;
            mes ++;
        }
        return invest;
    }

    public static void escrever (Object msg){
        System.out.println(msg);
    }
}

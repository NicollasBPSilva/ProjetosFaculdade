package Aula2;
import java.util.*;

public class TestePOO {
    public static void main(String[] args){
                    
        Scanner sc = new Scanner(System.in);
                      
        escrever("Escreva um valor entre 0 e 10.");
    
        int valor = sc.nextInt(); 

        escrever(Validar_val(valor));
       sc.close();
    }

    public static String Validar_val (int valor){
        while(valor < 0 || valor > 10){
            return "O valor digitado está incorreto.";
        }

    return "Valor digitado está correto.";
    }

    public static void escrever (Object msg){
        System.out.println(msg);
    }

}

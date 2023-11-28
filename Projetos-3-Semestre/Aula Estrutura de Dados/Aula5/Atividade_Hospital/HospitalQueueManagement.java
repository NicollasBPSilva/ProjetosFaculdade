package Aula5.Atividade_Hospital;

import java.util.Random;

public class HospitalQueueManagement {

    private int last;
    private int next;
    private String[] queue;

    public HospitalQueueManagement(){
        last = -1;
        next = -1;
        queue = new String[10];
    }



    public void mostrarMenu(){
            System.out.println("******* Menu *******");
            System.out.println("(1) Retirar nova senha.");
            System.out.println("(2) Próximo.");
            System.out.println("(3) Exibir quadro.");
            System.out.println("(0) Sair.");
            System.out.println("********************");
        }

    public boolean isPreferencial(String password) throws Exception{
        if(password.contains("P")){
            return true;
        } else if (password.contains("N")){
            return false;
        } else{
            throw new Exception("Parametros inválisdo.");
        }
    }
    
    public String getPassword(boolean isPreferencial){
        String pwd = (isPreferencial ? "P" : "N") + (100 + new Random().nextInt(800));

        queue[++last] = pwd;
        return pwd;
    }
    
    public void next(){
        next++;
        drawBoard();
    }

    public void drawBoard(){
        String lastName = "-", nextName = " - ";

        if(next != 1){
            nextName = queue[next];
            int  end = Math.max(0, next -3);
            
            for(int i = next - 1; i >= end; i--){
                lastName += queue[i] + "-";
            }
        }

        System.out.printf("|---------------|\n");
        System.out.printf("| Próximo: %s   |", nextName);
        System.out.printf("| Próximas senhas:    |");
        System.out.printf("| %s |\n", String.format("%-16s", lastName));
        System.out.printf("|---------------|\n");
    }

    public int getLast() {
        return last;
    }
    public void setLast(int last) {
        this.last = last;
    }
    public int getNext() {
        return next;
    }
    public void setNext(int next) {
        this.next = next;
    }
}
package Exercicio3.Ordenacao;

public class MethodInsertion implements Ordenacao {

    @Override
    public void ordenacao(int[] v) {
        int i, j;
        int temp;
        for (i = 1; i < v.length; i++) {
            temp = v[i];
            j = i;
            while (j > 0 && v[j - 1] >= temp) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = temp;
        }
    }

}

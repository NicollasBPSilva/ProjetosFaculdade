package Prova;

public class PilhaDocumentos {

    private Documento[] documentos;
    private int tamanho;

    public PilhaDocumentos() {
        this.documentos = new Documento[5];
        this.tamanho = 0;
    }

    public void adicionar(Documento documento) {
        if (this.documentos.length == tamanho){
            aumentarTamanho();
        } else {
        for (int i = 0; i < this.documentos.length; i++) {
            if (this.documentos != null) {
                this.documentos[tamanho] = documento;
                tamanho++;
                break;
                }
            }
        }
    }

    public void aumentarTamanho() {
        Documento novoArray[] = new Documento[tamanho * 2];
        for (int i = 0; i < tamanho; i++) {
            novoArray[i] = documentos[i];
        }
        documentos = novoArray;
    }

    public void assinar() {
        int posicao = tamanho - 1;

        for (int i = 0; i < tamanho; i++) {
            System.out.println(String.format("Documento %s assinado com sucesso!!", documentos[posicao].getTitulo()));
            documentos[posicao] = null;
            tamanho--;
            break;
        }
    }

    public void exibir() {
        for (Documento i : documentos) {
            if (i != null) {
                System.out.println(i.getTitulo());
            } else {
                System.out.println("Sem documentos.");
            }
        }

    }

}
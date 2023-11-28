package Atividade_Roleta;

public class Roleta_Premios {

    private Premio inicio;
    private Premio fim;

    public void adicionar(String premio) {
        if(inicio == null){
            inicio = new Premio(premio);
            inicio.setProximo(inicio);
            inicio.setAnterior(inicio);
            fim = inicio;
        } else {
            Premio novoPremio = new Premio(premio);
            fim.setProximo(novoPremio);
            novoPremio.setAnterior(fim);
            fim = novoPremio;
        }  
    }

    public void remover(String premio) {
        if(inicio == null){
            return;
        } else {
            Premio item = inicio;
            do{
                if(item.getNome().equals(premio)){
                    item.getAnterior().setProximo(item.getProximo());
                    item.getProximo().setAnterior(item.getAnterior());
                }
                item = item.getProximo();
            } while (inicio != item);
        }
    }

    public void alterar(String antigo, String novo) {
        
    }

    public int totalPremios() {
        int quantidade = 0;
        Premio qntPremios = inicio;
        if(inicio != null && inicio != fim){
            for(Premio qntPremios : inicio){
                quantidade ++;
                break;
            }
        }
        return quantidade;
    }

    public void verPremios() {
        if(inicio == null){
            return;
        }
        Premio verificar = inicio;
        do{
            System.out.println(verificar.getNome());
            verificar = verificar.getProximo();
        }while(verificar == inicio);
    }

    // private String rodar() {
        
    // }

}
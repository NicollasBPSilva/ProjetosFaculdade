package ExOberserver.Observer;

public interface Subject {
    
    public void addObservador(Observer observer);
    public void notificar();
    public void setAcao(Acao acao);

}

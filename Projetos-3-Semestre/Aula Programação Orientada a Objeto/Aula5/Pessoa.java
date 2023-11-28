package Aula5;

public class Pessoa {
    
    protected int id;
    private String nome;
    private String pai;
    private String mae;
    private boolean ativo;

    public String getNome() {
        return nome;    
    }

    public String getPai() {
        return pai;
    }

    public String getMae() {
            return mae;
    }

    public boolean isAtivo() {
            return ativo;
    }

    public void setNome(String nom){
        nome=nom;
    }

    public void setPai(String pai){
        this.pai=pai;
    }
                    
    public void setMae (String mamae){
        mae = mamae;
    }

    public void setAtivo (boolean ativo){
        this.ativo=ativo;
    }

}

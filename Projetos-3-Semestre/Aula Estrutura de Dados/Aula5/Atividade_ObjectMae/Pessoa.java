package Aula5.Atividade_ObjectMae;

class Pessoa {
    private String nome;
    private Pessoa mae;

    public Pessoa(){
      
    }
  
    public Pessoa(String nome){
      this.nome = nome;
    }

    public Pessoa(String nome, Pessoa mae){
        this.nome = nome;
        this.mae = mae;
    }
  
    
    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
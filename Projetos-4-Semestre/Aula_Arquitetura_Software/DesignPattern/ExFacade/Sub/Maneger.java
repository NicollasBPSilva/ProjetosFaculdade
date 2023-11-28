package ExFacade.Sub;

public class Maneger {
    
     private String nome;
 private int id;

    public Maneger() {
    }

    public Maneger(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public Maneger pesquisarManegerId(int id){
    DataBase DataBase=new DataBase();
    DataBase.carregarDados();
     for(Maneger g:DataBase.getListaManegers()){
       if(id==g.getId()){
         return g;
       }
     }
     return null;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Maneger{" + "nome=" + nome + ", id=" + id + '}';
    }
}

package ExFacade.Sub;

public class User {
    
    private String nome;
    private long id;

    public User() {
    }

    public User(String nome, long id) {
        this.nome = nome;
        this.id = id;
    }

    public User pesquisarUserId(long id){
     DataBase DataBase=new DataBase();
     DataBase.carregarDados();
     for(User c:DataBase.getListaUsers()){
       if(id==c.getId()){
         return c;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" + "nome=" + nome + ", id=" + id + '}';
    } 
}

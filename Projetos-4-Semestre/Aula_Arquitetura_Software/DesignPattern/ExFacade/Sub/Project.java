package ExFacade.Sub;

public class Project {
    private String nome;
    private int id;
    private String dataInicio;
    private String dataFim;

    public Project() {
    }

    public Project(String nome, int id, String dataInicio, String dataFim) {
        this.nome = nome;
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Project pesquisarProjectId(int id){
      DataBase DataBase=new DataBase();
      DataBase.carregarDados();
     for(Project p:DataBase.getListaProjects()){
       if(id==p.getId()){
         return p;
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

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public String toString() {
        return "Project{" + "nome=" + nome + ", id=" + id + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + '}';
    }
  
}

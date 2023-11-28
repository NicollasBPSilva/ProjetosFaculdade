package ExFacade.Sub;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    
    private List<User> listaUsers=new ArrayList<>();
    private List<Maneger> listaManegers=new ArrayList<>();
    private List<Project> listaProjects=new ArrayList<>();

    public List<User> getListaUsers() {
        return listaUsers;
    }

    public List<Maneger> getListaManegers() {
        return listaManegers;
    }

    public List<Project> getListaProjects() {
        return listaProjects;
    }
  
    public void carregarDados(){
       listaUsers.add(new User("Mel", 123));
       listaUsers.add(new User("Gaia", 456));
       
       listaManegers.add(new Maneger("Tonica", 1));
       listaManegers.add(new Maneger("Mustaf�", 3));
       listaManegers.add(new Maneger("Ronda", 6));
       
       listaProjects.add(new Project("Loja Mel", 23, "23/06/23", "12/07/24"));
       listaProjects.add(new Project("Loja Gaia", 45, "12/02/23", "28/12/24"));
    }
}

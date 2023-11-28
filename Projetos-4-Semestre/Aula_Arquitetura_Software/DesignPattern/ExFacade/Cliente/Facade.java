package ExFacade.Cliente;

import ExFacade.Sub.*;

public class Facade {
    
    public void gerarRelatorio() {
        
        User User = new User ();
        Maneger Maneger = new Maneger ();
        Project Project = new Project();
        
        System.out.println("User: " + User.pesquisarUserId(456));
        System.out.println("Maneger: " + Maneger.pesquisarManegerId(1));
        System.out.println("Project: " + Project.pesquisarProjectId(45));
    }
    
}

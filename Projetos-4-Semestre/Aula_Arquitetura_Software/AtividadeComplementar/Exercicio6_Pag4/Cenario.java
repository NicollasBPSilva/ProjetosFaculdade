package AtividadeComplementar.Exercicio6_Pag4;

public class Cenario {
    
  private static Cenario cenario = null;
  
  Cenario(){
    
  }

  public static Cenario getCenario(){
      if(cenario==null)
        cenario = new Cenario();
      
      return cenario;
  }  

  public String configuracao(){
    return("Configuração realizada com sucesso.");
  }

}


package ExOberserver.Cliente;

import ExOberserver.Observer.*;

public class Jogo {
    
    public static void main(String[] args) {
    
        Subject naveJ = new NaveJogador("Nico");
        Observer navI1 = new NaveInimiga("Nave inimiga 1", naveJ);
        
        naveJ.setAcao(Acao.AVANCAR);
        naveJ.setAcao(Acao.VIRAR_DIR);
        naveJ.setAcao(Acao.RECUAR);

        Observer navI2 = new NaveInimiga("Nave inimiga 2", naveJ);

        naveJ.setAcao(Acao.VIRAR_DIR);

    }

}

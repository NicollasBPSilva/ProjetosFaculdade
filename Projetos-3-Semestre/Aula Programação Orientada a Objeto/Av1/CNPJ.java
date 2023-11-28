package Av1;

public class CNPJ extends Cliente {
    private String CPNJ;
    private String inscricaoEst;
    
    public String getCPNJ() {
        return CPNJ;
    }
    public void setCPNJ(String cPNJ) {
        CPNJ = cPNJ;
    }
    public String getInscricaoEst() {
        return inscricaoEst;
    }
    public void setInscricaoEst(String inscricaoEst) {
        this.inscricaoEst = inscricaoEst;
    }
}

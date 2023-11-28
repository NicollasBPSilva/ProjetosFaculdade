package Av1;

import java.util.Date;

public class CPF extends Cliente {
    private String CPF;
    private String RG;
    private Date DtNasc;
    
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public String getRG() {
        return RG;
    }
    public void setRG(String rG) {
        RG = rG;
    }
    public Date getDtNasc() {
        return DtNasc;
    }
    public void setDtNasc(Date dtNasc) {
        DtNasc = dtNasc;
    }
}

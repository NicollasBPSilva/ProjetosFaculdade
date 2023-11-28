package Av1;

import java.util.Date;

public class Contrato {
    private int numero;
    private double cota;
    private Date dtinvig;
    private Date dtfimvig;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getConta() {
        return cota;
    }
    public void setConta(double cota) {
        this.cota = cota;
    }
    public Date getDtinvig() {
        return dtinvig;
    }
    public void setDtinvig(Date dtinvig) {
        this.dtinvig = dtinvig;
    }
    public Date getDtfimvig() {
        return dtfimvig;
    }
    public void setDtfimvig(Date dtfimvig) {
        this.dtfimvig = dtfimvig;
    }


}

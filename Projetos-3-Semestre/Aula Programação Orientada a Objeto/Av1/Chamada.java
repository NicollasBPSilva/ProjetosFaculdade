package Av1;

import java.util.Date;

public class Chamada {
    private int numChamada;
    private String motivo;
    private Date dtAbert;
    private Date dtFecha;
    
    public int getNumChamada() {
        return numChamada;
    }
    public void setNumChamada(int numChamada) {
        this.numChamada = numChamada;
    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public Date getDtAbert() {
        return dtAbert;
    }
    public void setDtAbert(Date dtAbert) {
        this.dtAbert = dtAbert;
    }
    public Date getDtFecha() {
        return dtFecha;
    }
    public void setDtFecha(Date dtFecha) {
        this.dtFecha = dtFecha;
    }
}

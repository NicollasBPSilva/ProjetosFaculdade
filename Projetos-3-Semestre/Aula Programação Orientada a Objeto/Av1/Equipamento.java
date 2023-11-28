package Av1;

import java.util.Date;

public class Equipamento {
    private int numSerie;
    private Date dtFabric;
    private String modelo;
    private String tipoEquip;
    
    public int getNumSerie() {
        return numSerie;
    }
    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }
    public Date getDtFabric() {
        return dtFabric;
    }
    public void setDtFabric(Date dtFabric) {
        this.dtFabric = dtFabric;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getTipoEquip() {
        return tipoEquip;
    }
    public void setTipoEquip(String tipoEquip) {
        this.tipoEquip = tipoEquip;
    }
}
    
public class Aviao{
    private Long id;
    private String codigo;
    private double carga;
    private int qtdEconomia;
    private int qtdPrimeira;
    private int qtdExecutiva;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public double getCarga() {
        return carga;
    }
    public void setCarga(double carga) {
        this.carga = carga;
    }
    public int getQtdEconomia() {
        return qtdEconomia;
    }
    public void setQtdEconomia(int qtdEconomia) {
        this.qtdEconomia = qtdEconomia;
    }
    public int getQtdPrimeira() {
        return qtdPrimeira;
    }
    public void setQtdPrimeira(int qtdPrimeira) {
        this.qtdPrimeira = qtdPrimeira;
    }
    public int getQtdExecutiva() {
        return qtdExecutiva;
    }
    public void setQtdExecutiva(int qtdExecutiva) {
        this.qtdExecutiva = qtdExecutiva;
    }
}

public enum TipoBagagemEnum {
    private Long id;
    private String nome;
    private double pesoMax;

    Bagagem mao = new Bagagem();
    Bagagem nacional = new Bagagem();
    Bagagem internacional = new Bagagem();

    mao.PesoaMaxBagagemenum(5.0);
    nacional.PesoaMaxBagagemenum(23.0);
    internacional.PesoaMaxBagagemenum(32.0);

    private Double PesoaMaxBagagemenum(Double pesoMax) {
        this.pesoMax = pesoMax;
    }

    public Double getPesoMax(){
        return pesoMax;
    }
    
    public void setPesoMax(Double pesoMax){
        this.pesoMax = pesoMax;
    }
}

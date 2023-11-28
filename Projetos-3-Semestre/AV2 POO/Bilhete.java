
public abstract class Bilhete {

    private Long id;
    private int numero;
    private String assento;

    public void reserva(Passageiro passageiro) {
        
        
    }

    public void comprar() {
        
    }

    public void cancelarReserva() {
        
    }

    public void checkin(Bagagem bagagem) {
        
    }

    public abstract int maximoBagagem() {
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }


}
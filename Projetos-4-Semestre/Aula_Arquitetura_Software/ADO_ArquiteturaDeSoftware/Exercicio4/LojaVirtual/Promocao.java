package Exercicio4.LojaVirtual;

public class Promocao implements Produto {
    
    private String nome;
    private double precoSemDesconto;
	private double desconto;
    private double precoComDesconto;
    
	public Promocao() {
    }

    public Promocao(String nome, double precoSemDesconto, double desconto) {
		this.nome = nome;
		this.precoSemDesconto = precoSemDesconto;
		this.desconto = desconto;
		this.precoComDesconto = this.precoSemDesconto - this.desconto;
	}

    @Override
    public double getPrecoTotal(){
        return precoComDesconto;
    }
  
    @Override
    public String toString() {
        return "\nProduto: " + nome + " - Preço: R$" + precoSemDesconto + " - Valor de desconto: R$" 
        + desconto + " - Valor à pagar: R$" + precoComDesconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoSemDesconto() {
        return precoSemDesconto;
    }

    public void setPrecoSemDesconto(double precoSemDesconto) {
        this.precoSemDesconto = precoSemDesconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getPrecoCemDesconto() {
        return precoComDesconto;
    }

    public void setPrecoCemDesconto(double precoComDesconto) {
        this.precoComDesconto = precoComDesconto;
    }

}
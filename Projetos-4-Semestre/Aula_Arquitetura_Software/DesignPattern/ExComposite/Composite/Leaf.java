package ExComposite.Composite;

public class Leaf implements Component {
    
    private String nome;
    private double preco;

    public Leaf() {
    }

    public Leaf(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco(){
        return preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " - Preço unitario R$ " + preco + "\n";
    }

}

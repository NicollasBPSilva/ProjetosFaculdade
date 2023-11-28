package ExComposite.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    
    private List<Component> lista;

    public Composite(){
        lista = new ArrayList<>();
    }

    @Override
    public double getPreco(){
        
        double total = 0;

        for(Component c : lista){
            total += c.getPreco();
        }

        return total;
    }

    public void adicionar(Component component){
        lista.add(component);
    }

    public void remover(Component component){
        lista.remove(component);
    }

    @Override
    public String toString() {
        return "Itens da cesta: \n" + lista;
    }

}

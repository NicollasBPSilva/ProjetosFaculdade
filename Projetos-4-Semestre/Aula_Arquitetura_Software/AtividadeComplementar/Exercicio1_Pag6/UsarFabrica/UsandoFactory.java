package AtividadeComplementar.Exercicio1_Pag6.UsarFabrica;

import java.util.List;

import AtividadeComplementar.Exercicio1_Pag6.Fabrica.EscolhendoArray;
import AtividadeComplementar.Exercicio1_Pag6.Fabrica.TiposArray;
import AtividadeComplementar.Exercicio1_Pag6.TodosArrays.EstruturaArrayList;
import AtividadeComplementar.Exercicio1_Pag6.TodosArrays.EstruturaLikedList;
import AtividadeComplementar.Exercicio1_Pag6.TodosArrays.EstruturaVector;

public class UsandoFactory {

    public static void main(String[] args) {
        
        EscolhendoArray.escolhaArray(TiposArray.ARRAYLIST);
		EstruturaArrayList exArrayList = new EstruturaArrayList();

		List listagemA = exArrayList.getEstruturas();

		listagemA.add(57);
		listagemA.add(17);
		listagemA.add(38);
		Escrever(listagemA.get(2));
		
		EscolhendoArray.escolhaArray(TiposArray.LINKEDLIST);
		EstruturaLikedList exLikedList = new EstruturaLikedList();
	
		List listagemL = exLikedList.getEstruturas();

		listagemL.add(17);
		listagemL.add(4);
		listagemL.add(7);
		Escrever(listagemL.get(1));

		EscolhendoArray.escolhaArray(TiposArray.VECTOR);
		EstruturaVector exVector = new EstruturaVector();

		List listagemV = exVector.getEstruturas();

		listagemV.add(21);
		listagemV.add(12);
		listagemV.add(10);
		Escrever(listagemV.get(0));

    }

    public static void Escrever (Object msg){
        System.out.println(msg);
    }
}

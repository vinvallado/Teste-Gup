import java.util.List;

import dados.Banco;
import entity.Item;
import error.ItemException;

public class Teste2 {
	
	public static void main (String[] args) {
		
		Banco banco = new Banco();
		List<Item> itens = banco.getItens();
		
		processarItens(itens);
	}

	private static void processarItens(List<Item> itens) 
	{
		for (Item i : itens) {
			try {
				processar(i);
				System.out.println(i);
			} catch (ItemException e) {
				System.out.println(e.getMessage());
			}
		}	
	}
	
	private static void processar(Item i) throws ItemException {
		
		Banco banco = new Banco();
		List<Item> itens = banco.getItens();
		
		for (Item i2 : itens) {
			if (i2.getId().equals(i.getId()) && (i.getStatus().equals("P"))){
					 throw new ItemException("Item já processado!");
			} else {
				i.setStatus("P");
			}
		}	
		
		
	}

}

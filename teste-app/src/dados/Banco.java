package dados;

import java.util.ArrayList;
import java.util.List;

import entity.Item;

public class Banco {

	private List<Item> itens = new ArrayList<Item>();

	public Banco() {
		itens.add(new Item(1,"A1","N"));
		itens.add(new Item(2,"B1","N"));
		itens.add(new Item(1,"A1","N"));
		itens.add(new Item(3,"D1","N"));
		itens.add(new Item(4,"E1","N"));
	}
	
	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	
}

package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		PrintCatalogVisitor visitor = new PrintCatalogVisitor();
		for (Item i : items)
			i.accept(visitor);
	}
	
	public void printOnlyBooks() {
		PrintBooksVisitor visitor = new PrintBooksVisitor();
		for (Item i : items)
			i.accept(visitor);
	}

	public void printOnlyCDs() {
		PrintCDsVisitor visitor = new PrintCDsVisitor();
		for (Item i : items)
			i.accept(visitor);
	}

}

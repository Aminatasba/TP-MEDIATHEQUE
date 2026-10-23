package mediatheque;

public class PrintBooksVisitor implements ItemVisitor {

	public void visit(Book book) {
		System.out.println(book);
	}

	public void visit(CD cd) {
		// c'est un CD, on ne l'affiche pas
	}
}

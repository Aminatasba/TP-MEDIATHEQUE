package mediatheque;

public class PrintCDsVisitor implements ItemVisitor {

	public void visit(Book book) {
		// c'est un livre, on ne l'affiche pas
	}

	public void visit(CD cd) {
		System.out.println(cd);
	}
}

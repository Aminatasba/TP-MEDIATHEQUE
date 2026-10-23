package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();
        mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem( new CD(12, "Sergeant Peppers"));
        mediatheque.addItem( new Book("Antoine de Saint-Exupéry", "Le Petit Prince"));
        mediatheque.addItem( new CD(10, "Thriller"));
        mediatheque.printCatalog();
        System.out.println("----------");
        mediatheque.printOnlyBooks();
        System.out.println("----------");
        mediatheque.printOnlyCDs();
    }
}

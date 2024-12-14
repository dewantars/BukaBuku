package Book;

import Book.Book;

public class Majalah extends Book{
    private String jenisMajalah;

    public Majalah(String jenisMajalah, String title, String isbn, String author, int price, int publicationYear, String publication, double rating, String category) {
        super(title, isbn, author, price, publicationYear, publication, rating, "Majalah");
        this.jenisMajalah = jenisMajalah;
    }

    @Override
    public void displayBookDetails() {
        super.displayBookDetails(); 
        System.out.println("Jenis : " + jenisMajalah);
    }
    
    

    
}

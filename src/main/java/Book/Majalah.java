package Book;

import Book.Book;

public class Majalah extends Book{
    private String jenisMajalah;

    public Majalah(String title, String author, int price, int publicationYear, String publication, double rating, String jenisMajalah) {
        super(title, author, price, publicationYear, publication, rating, "Majalah");
        this.jenisMajalah = jenisMajalah;
    }

    @Override
    public void displayBookDetails() {
        super.displayBookDetails(); 
        System.out.println("Jenis : " + jenisMajalah);
    }

    public String getJenisMajalah() {
        return jenisMajalah;
    }

    public void setJenisMajalah(String jenisMajalah) {
        this.jenisMajalah = jenisMajalah;
    }
    
    
    
    

    
}

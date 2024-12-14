package Book;

import Book.Book;

public class Komik extends Book {
    private String genreKomik;

    public Komik(String genreKomik, String title, String isbn, String author, int price, int publicationYear, String publication, double rating, String category) {
        super(title, isbn, author, price, publicationYear, publication, rating, category);
        this.genreKomik = genreKomik;
    }

    public void printBookInfo(){
        super.displayBookDetails();
        System.out.println("Genre : " + genreKomik);
    }
}

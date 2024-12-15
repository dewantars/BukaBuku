package Book;

import Book.Book;

public class Komik extends Book {
    private String genreKomik;

    public Komik(String title, String author, int price, int publicationYear, String publication, double rating, String genreKomik) {
        super(title, author, price, publicationYear, publication, rating, "Komik");
        this.genreKomik = genreKomik;
    }

    public void printBookInfo(){
        super.displayBookDetails();
        System.out.println("Genre : " + genreKomik);
    }

    public String getGenreKomik() {
        return genreKomik;
    }

    public void setGenreKomik(String genreKomik) {
        this.genreKomik = genreKomik;
    }
    
}

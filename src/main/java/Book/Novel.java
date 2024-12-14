package Book;

import Book.Book;

public class Novel extends Book{
    private String genreNovel;

    public Novel(String genreNovel, String title, String isbn, String author, int price, int publicationYear, String publication, double rating, String category) {
        super(title, isbn, author, price, publicationYear, publication, rating, category);
        this.genreNovel = genreNovel;
    }

    @Override
    public void displayBookDetails() {
        super.displayBookDetails();
        System.out.println("Genre: " + this.genreNovel);
    }

    
}

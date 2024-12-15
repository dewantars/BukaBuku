package Book;

import Book.Book;

public class Novel extends Book{
    private String genreNovel;

    public Novel(String title, String author, int price, int publicationYear, String publication, double rating, String genreNovel) {
        super(title, author, price, publicationYear, publication, rating, "Novel");
        this.genreNovel = genreNovel;
    }

    @Override
    public void displayBookDetails() {
        super.displayBookDetails();
        System.out.println("Genre: " + this.genreNovel);
    }

    
}

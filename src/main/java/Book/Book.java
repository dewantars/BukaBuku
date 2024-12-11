package Book;

public abstract class Book implements IBook{
    private String title;
    private String isbn;
    private String author;
    private int price;
    private int publicationYear;
    private String publication;
    private String category;
    private double rating;

    public Book(String title, String isbn, String author, int price, int publicationYear, String publication, String category, double rating) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
        this.publication = publication;
        this.category = category;
        this.rating = rating;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Judul: " + title);
        System.out.println("ISBN: " + isbn);
        System.out.println("Penulis: " + author);
        System.out.println("Harga: Rp " + price);
        System.out.println("Tahun Terbit: " + publicationYear);
        System.out.println("Penerbit: " + publication);
    }
}

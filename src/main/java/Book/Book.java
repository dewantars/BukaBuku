package Book;

public class Book implements IBook {

    private String title;
    private String author;
    private int price;
    private int publicationYear;
    private String publication;
    private String category;
    private double rating;

    public Book(String title, String author, int price, int publicationYear, String publication, double rating, String category) {
        this.title = title;
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
    
    @Override
    public void displayBookDetails() {
        System.out.println("Judul: " + title);
        System.out.println("Penulis: " + author);
        System.out.println("Harga: Rp " + price);
        System.out.println("Tahun Terbit: " + publicationYear);
        System.out.println("Penerbit: " + publication);
        System.out.println("Kategori: " + this.category);
        System.out.println("Rating: " + this.rating);
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return ". " + title +"\t" + author + "\t" + this.category + "\t" + this.rating + "\t" + this.price ;
    }

}

package Book;

import Book.Book;

public class Sejarah extends Book{
    private String periodeSejarah;
    private String lokasiSejarah;
    private double discountRate = 0.2;
    
    public Sejarah(String periodeSejarah, String lokasiSejarah, String title, String isbn, String author, int price, int publicationYear, String publication, double rating, String category) {
        super(title, isbn, author, price, publicationYear, publication, rating, category);
        this.periodeSejarah = periodeSejarah;
        this.lokasiSejarah = lokasiSejarah;
    }

    public double hargaDiskon(){
        return super.getPrice() * this.discountRate;
    }

    public double dapatHarga(){
        return hargaDiskon();
    }

    @Override
    public void displayBookDetails() {
        super.displayBookDetails(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Periode Sejarah : " + this.periodeSejarah);
        System.out.println("Lokasi Sejarah : " + this.periodeSejarah);
    }
    
    
    
    
}

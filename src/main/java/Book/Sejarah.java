package Book;

import Book.Book;

public class Sejarah extends Book{
    private String periodeSejarah;
    private String lokasiSejarah;
    private double discountRate = 0.2;
    
    public Sejarah(String title, String author, int price, int publicationYear, String publication, double rating, String periodeSejarah, String lokasiSejarah) {
        super(title, author, price, publicationYear, publication, rating, "Sejarah");
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

    public String getPeriodeSejarah() {
        return periodeSejarah;
    }

    public void setPeriodeSejarah(String periodeSejarah) {
        this.periodeSejarah = periodeSejarah;
    }

    public String getLokasiSejarah() {
        return lokasiSejarah;
    }

    public void setLokasiSejarah(String lokasiSejarah) {
        this.lokasiSejarah = lokasiSejarah;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
    
    
    
}

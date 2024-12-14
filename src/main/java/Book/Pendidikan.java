package Book;

import Book.Book;

public class Pendidikan extends  Book{
    private String namaBidang;
    private double discountRate = 0.5;

    public Pendidikan(String namaBidang, String title, String isbn, String author, int price, int publicationYear, String publication, double rating, String category) {
        super(title, isbn, author, price, publicationYear, publication, rating, "Pendidikan");
        this.namaBidang = namaBidang;
    }
    
    public double hargaDiskon(){
        return super.getPrice() * discountRate;
    }

    public double dapatHarga(){
        return hargaDiskon();
    }

    @Override
    public void displayBookDetails() {
        super.displayBookDetails(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Nama Bidang Pengetahuan : " + this.namaBidang);
    }
    
    
}

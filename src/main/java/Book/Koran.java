package Book;

import Book.Book;

public class Koran extends Book{
    private String tanggalCetak;

    public Koran(String judulBuku, String idBuku, String namaPenulis, String namaPenerbit, int harga, String Kategori, int tahunTerbit, double rating, String tanggalCetak) {
        super(judulBuku, idBuku, namaPenulis, namaPenerbit, harga, Kategori, 0, rating);
        this.tanggalCetak = tanggalCetak;
    }

    @Override
    public void printInfoBuku(){
        System.out.println("ID Buku : " + super.getIdBuku());
        System.out.println("Judul Buku : " + super.getJudulBuku());
        System.out.println("Nama Penulis : " + super.namaPenulis);
        System.out.println("Penerbit : " + super.namaPenerbit);
        System.out.println("Kategori : " + super.Kategori);
        System.out.println("Tanggal terbit : " + this.tanggalCetak);
        System.out.println("Rating : " + super.rating);
        System.out.println("Harga : " + super.getHarga());
    }
}

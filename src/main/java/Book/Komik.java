package Book;

import Book.Book;

public class Komik extends Book {
    private String genreKomik;

    public Komik(String judulBuku, String idBuku, String namaPenulis, String namaPenerbit, int harga, String Kategori, int tahunTerbit, double rating, String genreKomik) {
        super(judulBuku, idBuku, namaPenulis, namaPenerbit, harga, Kategori, tahunTerbit, rating);
        this.genreKomik = genreKomik;
    }

    @Override
    public void printInfoBuku(){
        System.out.println("ID Buku : " + super.getIdBuku());
        System.out.println("Judul Buku : " + super.getJudulBuku());
        System.out.println("Nama Penulis : " + super.namaPenulis);
        System.out.println("Penerbit : " + super.namaPenerbit);
        System.out.println("Kategori : " + super.Kategori);
        System.out.println("Genre : " + this.genreKomik);
        System.out.println("Rating : " + super.rating);
        System.out.println("Tahun Terbit : " + super.tahunTerbit);
        System.out.println("Harga : " + super.getHarga());
    }
}

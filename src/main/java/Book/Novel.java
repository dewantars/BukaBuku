package Book;

import Book.Book;

public class Novel extends Book{
    private String genreNovel;

    public Novel(String judulBuku, String idBuku, String namaPenulis, String namaPenerbit, int harga, String Kategori, int tahunTerbit, double rating, String genreNovel) {
        super(judulBuku, idBuku, namaPenulis, namaPenerbit, harga, Kategori, tahunTerbit, rating);
        this.genreNovel = genreNovel;
    }

    @Override
    public void printInfoBuku(){
        System.out.println("ID Buku : " + super.getIdBuku());
        System.out.println("Judul Buku : " + super.getJudulBuku());
        System.out.println("Nama Penulis : " + super.namaPenulis);
        System.out.println("Penerbit : " + super.namaPenerbit);
        System.out.println("Kategori : " + super.Kategori);
        System.out.println("Genre Novel : " + this.genreNovel);
        System.out.println("Tahun Terbit : " + super.tahunTerbit);
        System.out.println("Rating : " + super.rating);
        System.out.println("Harga : " + super.getHarga());
    }

    @Override
    public String toString() {
        return super.getIdBuku() + super.getJudulBuku() + super.namaPenulis + super.namaPenerbit + super.Kategori + this.genreNovel + super.tahunTerbit + super.rating + super.getHarga();
    }
}

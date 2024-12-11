package User;
import Book.*;
import java.util.ArrayList;
import java.util.List;

public class Keranjang {
    private List<Book> bukuDalamKeranjang;
    private int totalHarga;

    public Keranjang() {
        bukuDalamKeranjang = new ArrayList<>();
        totalHarga = 0;
    }

    public void tambahBuku(Book buku) {
        bukuDalamKeranjang.add(buku);
        totalHarga += buku.getPrice();
    }

    public void hapusBuku(Book buku) {
        bukuDalamKeranjang.remove(buku);
        totalHarga -= buku.getPrice();
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public List<Book> getDaftarBuku() {
        return bukuDalamKeranjang;
    }
}

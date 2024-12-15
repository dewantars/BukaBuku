package sistem;

import Book.*;
import java.util.HashMap;

public class Perpustakaan {
    private HashMap<String, Book> koleksiBuku = new HashMap<>();

    public void beliBuku(String id, Book buku) throws Exception {
        if (koleksiBuku.containsKey(id)) {
            throw new Exception("Buku sudah dibeli!");
        }
        koleksiBuku.put(id, buku);
        System.out.println("Buku " + buku.getTitle() + " berhasil dibeli.");
    }

    public void hapusBuku(String id) throws Exception {
        if (!koleksiBuku.containsKey(id)) {
            throw new Exception("Buku tidak ditemukan!");
        }
        Book buku = koleksiBuku.remove(id);
        System.out.println("Buku " + buku.getTitle() + " berhasil dihapus.");
    }

    public void printBuku() {
        if (koleksiBuku.isEmpty()) {
            System.out.println("Tidak ada buku dalam koleksi.");
        } else {
            System.out.println("Daftar Buku yang Dibeli:");
            koleksiBuku.forEach((id, Book) -> System.out.println(id + " - " + Book.getTitle() + " - " + Book.getCategory()));
        }
    }
}

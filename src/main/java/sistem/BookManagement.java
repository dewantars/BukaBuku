/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem;

import java.util.HashMap;
import Book.*;

/**
 *
 * @author Dewanta Rahma Satria
 */
public class BookManagement {
    private final HashMap<String, Book> daftarBuku = new HashMap<>();

    public BookManagement() {
        daftarBuku.put("N001", new Novel("Laskar Pelangi", "Nidji", 50000, 2012, "Gramedia", 4.9, "Motivation"));
        daftarBuku.put("N002", new Novel("Hujan", "Tere Liye", 64000, 2020, "Gramedia", 4.7, "Romance"));
        daftarBuku.put("M001", new Majalah("NATIONAL GEOGRAPHIC ID / ED 12", "NATIONAL GEOGRAPHIC ID", 30000, 2020, "Gridnetwork", 4.7, "Indonesia"));
        daftarBuku.put("M002", new Majalah("NATIONAL GEOGRAPHIC ID / ED 13", "NATIONAL GEOGRAPHIC ID", 30000, 2020, "Gridnetwork", 4.8, "Indonesia"));
        daftarBuku.put("K001", new Komik("NARUTO", "Masashi Kishimoto", 60000, 2020, "Akamaru Jump", 4.8, "Action"));
        daftarBuku.put("K002", new Komik("One Piece", "Eiichiro Oda", 60000, 2020, "Weekly Shōnen Jump", 4.8, "Action"));
    }

    public Book getBuku(String id) throws Exception {
        if (!daftarBuku.containsKey(id)) {
            throw new Exception("Buku tidak ditemukan!");
        }
        return daftarBuku.get(id);
    }

    public void printBuku() {
        System.out.println("Daftar Buku yang Tersedia:");
        daftarBuku.forEach((id, Book) -> System.out.println(id + " - " + Book.getTitle() + " - " + Book.getCategory()));
    }
}

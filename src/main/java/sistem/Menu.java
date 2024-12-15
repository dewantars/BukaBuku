/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem;

/**
 *
 * @author Dewanta Rahma Satria
 */
public class Menu {
    public static void LoginMenu(){
        headerFooter();
        System.out.println("Pilih Menu Pengguna");
        System.out.println("1. Admin");
        System.out.println("2. Pengguna");
        System.out.println("3. Keluar");
    }
    
    public static void AplicationName(){
        headerFooter();
        System.out.println("                  BukaBuku");
        System.out.println("               E-Book Platform");
        System.out.println("Made by Only []");
    }
    
    public static void headerFooter(){
        System.out.println("===================================================");
    }
    
    public static void menuAdmin(){
        headerFooter();
        System.out.println("Menu Admin");
        System.out.println("1. Tambah Data Buku"); 
        System.out.println("2. Hapus Data Buku");
        System.out.println("3. Edit Data Buku");
        System.out.println("3. Keluar");
    }
    
    public static void menuUser(){
        headerFooter();
        System.out.println("Menu User");
        System.out.println("1. Tampilkan E-Book");
        System.out.println("2. Cari E-Book");
        System.out.println("4. Tampilkan E-Book berdasarkan kategori");
        System.out.println("3. Perpustakaan Pengguna");
    }
    
    public static void menuPilihBuku(){
        System.out.println("Pilih Opsi");
        System.out.println("1. Baca Buku");
        System.out.println("2. Kembali ke menu");
    }
    
    public static void menuBacaBuku(){
        System.out.println("Pilih Opsi");
        System.out.println("1. Kembali ke menu");
    }
    
    public static void FormatBukuPrint(){
        System.out.println("No" +  "   Judul Buku" +  "\t\t" +  "Penulis Buku" + "\t\t" + "Penerbit" + "\t\t" +  "Kategori" + "\t" + "Harga" + "\t" + "Rating");
    }
    
    public static void menuKategoriBuku(){
        System.out.println("1. Pendidikan"); 
        System.out.println("3. Sejarah");
        System.out.println("2. Novel");
        System.out.println("4. Komik");
        System.out.println("5. Majalah");
    }
    
    public static void pilihanEditBukuPendidikan(){
        System.out.println("Pilih Opsi Edit");
        System.out.println("1. Judul");
        System.out.println("2. Penulis");
        System.out.println("3. Penerbit");
        System.out.println("4. Kategori");
        System.out.println("5. Bidang");
        System.out.println("5. Harga");
        System.out.println("6. Tahun Terbit");
        System.out.println("7. Rating");
    }
    
    public static void menuBeliBuku(){
        System.out.println("Mau Lakukan Apa?");
        System.out.println("1. Lihat Informasi Buku");
        System.out.println("2. Beli Buku");
    }
}

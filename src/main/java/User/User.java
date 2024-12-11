package User;

public class User {
    private String nama;
    private String email;
    private KeranjangBelanja keranjang;

    public Pengguna(String nama, String email) {
        this.nama = nama;
        this.email = email;
        this.keranjang = new KeranjangBelanja();
    }

    public KeranjangBelanja getKeranjang() {
        return keranjang;
    }

    public String getNama() {
        return nama;
    }
}

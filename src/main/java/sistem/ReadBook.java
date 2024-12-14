package sistem;

public class ReadBook {
    private String tanggalTerakhirBaca;

    public void bacaBuku() {
        System.out.println("Membaca buku...");
    }

    public void searchBuku() {
        System.out.println("Mencari buku...");
    }

    public void setTerakhirBaca(String tanggal) {
        this.tanggalTerakhirBaca = tanggal;
    }

    public String getTanggalTerakhirBaca() {
        return this.tanggalTerakhirBaca;
    }
}

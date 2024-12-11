package User;

public class Pembelian {
    protected String idPembelian;
    protected String tanggalPembelian;


    public void showStruk() {
        System.out.println("ID Pembelian: " + idPembelian);
        System.out.println("Tanggal Pembelian: " + tanggalPembelian);
    }

    public void setIdPembelian(String idPembelian) {
        this.idPembelian = idPembelian;
    }

    public int totalHarga() {
        return 0;
    }
}

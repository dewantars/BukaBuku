package User;

import Book.*;
import java.util.ArrayList;
import java.util.List;

public class Admin extends Account{
    private List<Book> daftarBuku;

    public Admin(List<Book> daftarBuku, String nama, String username, String password, Keranjang keranjang) {
        super(nama, username, password, keranjang);
        this.daftarBuku = daftarBuku;
    }
    
    
}

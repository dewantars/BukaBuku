package User;

import sistem.Keranjang;


public abstract class Account{
    private String nama;
    private String username;
    private String password;

    public Account(String nama, String username, String password) {
        this.nama = nama;
        this.username = username;
        this.password = password;
    }


    public String getNama() {
        return nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

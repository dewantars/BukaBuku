package User;
import java.util.HashMap;
import sistem.*;

public class User extends Account {
    private Perpustakaan perpus;

    public User(Perpustakaan perpus, String nama, String username, String password) {
        super(nama, username, password);
        this.perpus = perpus;
    }
    
    public Perpustakaan getPerpus() {
        return perpus;
    }

    public void setPerpus(Perpustakaan perpus) {
        this.perpus = perpus;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem;

import java.util.HashMap;
import User.*;
/**
 *
 * @author Dewanta Rahma Satria
 */
public class AccountManagement {
    private HashMap<String, Account> daftarAccount = new HashMap<>();
    
    public AccountManagement(){
        daftarAccount.put("dewa", new Admin("dewan", "dewa", "dewa123"));
        
    }
    
    public Account getAccount(String username) throws Exception {
        if (!daftarAccount.containsKey(username)){
            throw new Exception("Akun tidak ditemukan");
        }
        return daftarAccount.get(username);
    }
    
    
}

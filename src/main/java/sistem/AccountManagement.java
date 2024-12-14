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
        daftarAccount.put("Dewanta", new Admin("dewan", "dewa", "dewa123"));
        
    }
}

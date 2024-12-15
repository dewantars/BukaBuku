package sistem;

import java.util.InputMismatchException;
import java.util.Scanner;
import Book.*;
import User.*;

public class Main {
    public static void main(String[] args) {
        BookManagement bukuManagement = new BookManagement();
        AccountManagement Akun = new AccountManagement();
        Perpustakaan perpustakaan = new Perpustakaan();
        Scanner s = new Scanner(System.in);
        
        
        
        try{
            int opsi = 1;
            while(opsi!=3){
                Menu.LoginMenu();
                System.out.print("Pilih Opsi: ");
                opsi = s.nextInt();
                
                switch(opsi) {
                    case 1:
                        Menu.menuAdmin();
                        break;
                    case 2:
                        Menu.menuUser();
                        break;
                    case 3:
                        System.out.println("TerimaKasih, Keluar dari aplikasi.");
                        System.exit(0);
                    default:
                        System.out.println("Opsi tidak valid");
                }
            }
        }catch(InputMismatchException e){
            System.out.println("Harap masukkan angka");
        }catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }
    }
}
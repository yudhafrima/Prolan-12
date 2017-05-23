/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author Iscariot
 */
import java.util.Scanner;
public class Restaurantmain {
    public static void main(String args[]){
       String nama;
       String nomeja;
       
       Scanner input = new Scanner(System.in);
       
       System.out.println("Masukan nama :");
       nama = input.next();
       
       System.out.println("Masukan no meja :");
       nomeja = input.next();
       
      Tamu yudha = new Tamu();
      yudha.Booking();
      yudha.takefriendGF();
    }
}

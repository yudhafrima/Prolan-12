/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

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
       
       System.out.println("Masukan Nama :");
       nama = input.next();
       
       System.out.println("Masukan No Meja :");
       nomeja = input.next();
       
       Restaurant restaurant = new Tamu();
       restaurant.setNama(nama);
       System.out.println(restaurant.getNama());
       restaurant.setNoMeja(nomeja);
       System.out.println(restaurant.getNoMeja());
       restaurant.Makan();
       restaurant.BookingMeja();
       restaurant.BookingTempat();
    
    }
    
}

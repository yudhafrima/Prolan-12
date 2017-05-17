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
public class pelayan extends Restaurant{
    public Kamar(String nama, String kode){
        setNama(nama);
        setNoMeja(nomeja);
        System.out.println("Nama 	:" +getNama());
        System.out.println("No Meja :" +getNoMeja());
    }
    

    @Override
    public void Makan() {
         System.out.println("Memilih makanan yang teresedia di menu");
    }

    @Override
    public void BookingMeja() {
        System.out.println("Booking meja berhasil");    
    }

    @Override
    public void BookingTempat() {
        System.out.println("Booking tempat berhasil");    
    }

    @Override
    public void cancel() {
        System.out.println("pembataln transaksi dilakukan");    }
    
}

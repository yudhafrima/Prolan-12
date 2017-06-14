package Restaurant3;

import restaurant2.Restaurant2;

/**
 *
 * @author Iscariot
 */
public class Tamu extends Restaurant2 {
    public Tamu(String nama,String kode){
        setNama(nama);
        setNoMeja(nomeja);
        
        System.out.println("Nama 	:" +getNama());
        System.out.println("No Meja :" +getNoMeja());
        
    }

    public Tamu() {
    }

    @Override
    public void Makan() {
        System.out.println("selamat menikmati");
    }

    @Override
    public void BookingMeja() {
        System.out.println("Booking berhasil");
    }

    @Override
    public void Bayar() {
        System.out.println("Terima kasih ");
    }

    @Override
    public void cancel() {
        System.out.println("pembatalan sewa akan dilakukan");    }
    
}
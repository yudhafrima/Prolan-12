package restaurant2;

/**
 *
 * @author Iscariot
 */
public class Meja extends Restaurant2{
    public Meja(String nama, String kode){
        setNama(nama);
        setNoMeja(nomeja);
        System.out.println("Nama 	:" +getNama());
        System.out.println("No Meja :" +getNoMeja());
    }
    

    @Override
    public void Makan() {
         System.out.println("selamat makan");
    }

    @Override
    public void BookingMeja() {
        System.out.println("Booking berhasil");    
    }

    @Override
    public void Bayar() {
        System.out.println("terima kasih");    
    }

    @Override
    public void cancel() {
        System.out.println("pembataln sewa akan dilakukan");    }
    
}
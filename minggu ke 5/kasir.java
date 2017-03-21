public class kasir {
    String  nama,Pekerjaan,JenisKelamin = "wanita";
		Byte  umur;

    kasir(String nama){
      this.nama = nama;
				}
    
  public void NamaKaryawan(){
        System.out.println("Nama Karyawan : " +nama);
				}
    
  
  public void Pekerjaan(){
      System.out.println("Melayani Transaksi");
  }
}
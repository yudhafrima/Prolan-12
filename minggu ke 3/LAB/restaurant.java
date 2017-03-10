public class restaurant {
	private String  nama,JenisKelamin,jenis;
			int  umur;
	
	private void makan () {
		System.out.println ("Makan di restaurant");
	}
	
	public static void main (String[] args) {
		koki Rimba = new koki();

		Rimba.nama = "Rimba Santana";
        Rimba.TukangMasak();
	}
}

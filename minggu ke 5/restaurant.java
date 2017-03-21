public class Restaurant extends koki{
    
        @Override
        public void Pekerjaan(){
            System.out.println("Bekerja di restaurant");
        }
        
	public Restaurant (String nama) {
            super(nama);
        }
        
	public void koki () {
		System.out.println("Jenis kelamin : "
                        + super.JenisKelamin);
                
	super.Pekerjaan();
        Pekerjaan();
        
        }
        public static void main(String argd[]) {
            Restaurant nama = new Restaurant("Yuda");
            nama.NamaKaryawan();
            Restaurant pkrjn = new Restaurant("Yuda");
            pkrjn.koki();
            
        }
        }

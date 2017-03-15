import java.util.Scanner;
public class IPMahasiswa {

	public static void main(String[] args) {
	IPMahasiswa ipmhs = new IPMahasiswa();
	
        Scanner input = new Scanner(System.in);
	float ip;
	int JmlMhs = 0, jmlMhsLls = 0;
	System.out.print("Masukan IP: ");
	ip = input.nextFloat();
	while (ip != -999) {
		if (ipmhs.isWithinRange(ip, 0, 4) == 1) {
			JmlMhs++;
		}
		if (ip >= 2.75) {
			jmlMhsLls++;
		}
		System.out.print("Masukan IP: ");
		ip = input.nextFloat();
	}	
	
	System.out.println("Jumlah mahasiswa adalah : " + JmlMhs);
	System.out.println("Jumlah mahasiswa Lulus adalah : " + jmlMhsLls);
	
        }
        
	int isWithinRange(float X, int min, int max){
            if (X >= min && X <= max) {
		return 1;
            }	else {
		return 0;
            }	
	}
	}
        
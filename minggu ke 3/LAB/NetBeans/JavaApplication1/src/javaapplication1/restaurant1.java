/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author labkom7
 */
public class restaurant {
    	private String  nama,JenisKelamin,jenis;
			Byte  umur;
	
	private void makan () {
		System.out.println ("Makan di restaurant");
	}
	
    
    public static void main(String[] args) {
        koki Rimba = new koki();

		Rimba.nama = "Rimba Santana";
        Rimba.TukangMasak();
	}
    }
    
}

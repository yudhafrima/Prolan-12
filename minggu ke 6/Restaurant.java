/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author PC
 */
public class Restaurant {
        String nama,pekerjaan,JenisKelamin = "pria";
            Byte umur;
        
        public void Pekerjaan() {
            System.out.println("Jenis Pekerjaan di Restaurant");
            
        }
        
	public void JamKerja() {
            System.out.println("Jam kerja di restaurant (siang/malam)");
            
        }
        
        public void Kelaskaryawan() {
            System.out.println("Jenis kelas karyawan (Reguler/Freelance)");
            
        }
	
        
        Restaurant(String pekerjaan) {
            this.pekerjaan = pekerjaan;
            
        }
        }


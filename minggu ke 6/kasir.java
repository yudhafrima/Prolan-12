/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;


public class kasir extends Restaurant {

@Override
public void Pekerjaan(){
    System.out.println("Melayani transaksi di Restaurant");
    super.Pekerjaan();
}
 
@Override
public void JamKerja(){
    System.out.println("Malam hari");
    super.JamKerja();
				}
    
@Override
public void Kelaskaryawan(){
    System.out.println("kelas Freelance");
    super.Kelaskaryawan();
				}
  
 kasir (String pekerjaan){
     super(pekerjaan);
      System.out.println(pekerjaan);
  }
}
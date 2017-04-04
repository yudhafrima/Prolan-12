/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;


public class pelayan extends Restaurant{
    
@Override
public void Pekerjaan(){
    System.out.println("Melayani di Restaurant");
    super.Pekerjaan();
}
 
@Override
public void JamKerja(){
    System.out.println("Bekerja siang dan malam hari");
    super.JamKerja();
				}
    
@Override
public void Kelaskaryawan(){
    System.out.println("kelas Freelance");
    super.Kelaskaryawan();
				}
  
 pelayan (String pekerjaan){
     super(pekerjaan);
      System.out.println("pekerjaan");
  }
}
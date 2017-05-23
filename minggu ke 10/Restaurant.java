/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;


public interface Restaurant {
    
    public void Nama(String nama);
    public void NoMeja(String nomeja);
    
    public void Makan();
    public void BookingMeja();
    public void Bayar();
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant2;

/**
 *
 * @author Iscariot
 */
public abstract class Restaurant2 {
    private String nama;
    private String nomeja;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNoMeja() {
        return nomeja;
    }

    public void setNoMeja(String kode) {
        this.kode = nomeja;
    }
    
    /*
    method abstrack
    */
    
    public abstract void Makan();
    public abstract void BookingMeja();
    public abstract void Bayar();
    public abstract void  cancel();
    
    }
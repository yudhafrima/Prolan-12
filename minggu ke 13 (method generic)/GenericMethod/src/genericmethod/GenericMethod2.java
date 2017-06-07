/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package genericmethod;


public class GenericMethod2 {
	
    
    private static void getNik() {
        System.out.println(12);
    }
    public static <T> void Nim(T Nim) {
        System.out.println(Nim);
    }
    
    public static <T> void angka (T angka) {
        System.out.println(angka);
    }
    
    public static void main (String[] args){
      
      getNik();
      Nim("1012345");
     angka(200);
        
    }

    

    

    
    
}
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package genericmethod;


public class GenericMethod {

   
    private static <T> void printNilai(T nilai) {
        System.out.println("Nilai : " +nilai);
        
        Integer varInt = 8652339;
        Double varDouble = 96342.7656;
        Character varChar = 'Y';
        String varString = "Yuda";
        
        System.out.println();
        System.out.println("Nilai-nilai yang dicetak : ");
        
        print(varInt);
        print(varDouble);
        print(varChar);
        print(varString);
    }
    
    public static void print (Integer nilaiInteger) {
        System.out.println(nilaiInteger);
    }
    
    public static void print (Double nilaiDouble) {
        System.out.println(nilaiDouble);
    }
    
    public static void print (Character nilaiChar) {
        System.out.println(nilaiChar);
    }
    
    public static void print (String nilaiString) {
        System.out.println(nilaiString);

    }
}

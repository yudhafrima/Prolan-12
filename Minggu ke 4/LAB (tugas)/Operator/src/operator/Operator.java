/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator;

/**
 *
 * @author PC
 */
public class Operator {
public static void main(String[] args) {
	byte x = 5;
	byte y = 4;
	System.out.println("Apakah X sama dengan Y? " + (x==y));
	System.out.println("Apakah X TIDAK sama dengan Y? " + (x!=y));
	System.out.println("Apakah X lebih besar dengan Y? " + (x>y));
	System.out.println("Apakah X kurang dengan Y? " + (x<y));
	System.out.println("Apakah X lebih besar dari atau sama dengan Y? " + (x>=y));
	System.out.println("Apakah X kurang dari atau sama dengan Y? " + (x<=y));
	
	if (x != y) {
		System.out.println("Hasil increment x adalah " + (x>=y));
		System.out.println("Hasil increment x adalah " + (x>=y));
	}	
}	
}

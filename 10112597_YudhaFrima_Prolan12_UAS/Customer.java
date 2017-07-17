/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

import java.util.Scanner;

/**
 *
 * @author Iscariot
 */
public class Customer {
	int no;
	String name;
	String bookingno;
//	int indate;
//	int outdate;
	int nod,type;
	boolean status;
	
	Customer()
	{
		no=-1;
		name=null;
		bookingno=null;
		nod=type=ld=d=-1;
		status=false;
	}
	
	public void setInitialDetails(int c)
	{
		
		no=c;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name");
		name = in.nextLine();
//		System.out.println("Enter date as a number ex:24");
//		System.out.println("Enter today's date");
//		indate = in.nextInt();
		System.out.println("Enter Table type?1 for Smoking Area,2 for NonSmoking Area");
	    type = in.nextInt();
	    
	    
	    
	}
	
	public void setBookingNo(String b)
	{
		bookingno=b;
	}
	
	
}


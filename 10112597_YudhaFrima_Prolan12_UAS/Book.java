/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

/**
 *
 * @author Iscariot
 */
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Book implements Serializable{
	String bookno;
	Transportation t[][][];
	int ff;
	Customer cust;
	int s1=0,s2=0;
	
	
	public String getBookingNumber()
	{
		return bookno;
	}
	
	public void BookNew(Customer c,SmokingArea sa,NonSmokingArea nsa,Transportation tr[][][],int ily,int flag1,int idx,int flag2,int isdx,int flag3)
	
	{
		cust=c;
	    Fare f=new Fare();
	    int no,i;
	    
    	t=tr;
    	l=lr;
    	
	    if(c.type==1)
	    {
	    			if(flag1==0)
	    			{
	    				System.out.println("No Smoking Area Table Available");
	    				Scanner in5=new Scanner(System.in);
	    				
	    				System.out.println("Do you want any other Table? NonSmoking Area(2) ");
	    				int g=in5.nextInt();
	    				
	    				if(g==2)
		    				BookNonSmokingArea(c,nsa,g,insa);
	    			}
	    			if(flag1==1)
	    				BookSmokingArea(c,sa,c.type,isa);
	    }
	    if(c.type==2)
	    {
	    			if(flag2==0)
	    			{
	    				System.out.println("No NonSmokingArea Table Available");
	    				Scanner in6=new Scanner(System.in);
	    				
	    				System.out.println("Do you want any other Table? Smoking Area(1)");
	    				int g=in6.nextInt();
	    				
	    				if(g==2)
		    				BookSmokingArea(c,nsa,g,insa);
	    			}
	    			if(flag2==1)
	    				BookNonSmokingArea(c,sa,c.type,isa);
	    }
	    
	    
	
	
	
	public void BookSmokingArea(Customer c,SmokingArea sa,int type,int isa,int h)
	{
		Fare f=new Fare();
		ly.statuschange();
		
		if(ld==2)
		{
			System.out.println("For 2 people Smoking Area Table is booked");
			ff= f.farecalculator(h,y.rate);
			bookno=ily+"lx2";
			BookDisplay(ff,c.name,t[ily][0][0].getTotalCost(),l[ily][0][1].getTotalCost(),bookno);
			
		}
		if(ld==4)
		{
			System.out.println("For 4 people Smoking Area Table is booked");
			ff= f.farecalculator(h,ly.rate);
			bookno=ily+"lx4";
			BookDisplay(ff,c.name,t[isa][1][0].getTotalCost(),l[isa][1][1].getTotalCost(),bookno);
		}
		if(ld==6)
		{
			System.out.println("For 6 people Smoking Area Table is booked");
			ff= f.farecalculator(h,ly.rate);
			bookno=ily+"lx6";
			BookDisplay(ff,c.name,t[isa][0][0].getTotalCost(),l[isa][0][1].getTotalCost(),bookno);
			
		}
		
		
	}
	
	public void BookNonSmokingArea(Customer c,NonSmokingArea dx,int type,int idx,int ld,int d)
	{
		dx.statuschange();
		Fare f=new Fare();
		
		if(ld==2)
		{
			System.out.println("For 2 people NonSmoking Area Table is booked");
			ff= f.farecalculator(h,ly.rate);
			bookno=ily+"lx2";
			BookDisplay(ff,c.name,t[insa][0][0].getTotalCost(),l[isna][0][1].getTotalCost(),bookno);
			
		}
		if(ld==4)
		{
			System.out.println("For 4 people NonSmoking Area Table is booked");
			ff= f.farecalculator(h,ly.rate);
			bookno=ily+"lx4";
			BookDisplay(ff,c.name,t[insa][1][0].getTotalCost(),l[isna][1][1].getTotalCost(),bookno);
		}
		if(ld==6)
		{
			System.out.println("For 6 people NonSmoking Area Table is booked");
			ff= f.farecalculator(h,ly.rate);
			bookno=ily+"lx6";
			BookDisplay(ff,c.name,t[isna][0][0].getTotalCost(),l[isna][0][1].getTotalCost(),bookno);
			
		}
		
		
	}
	

	public void BookDisplay(int ff,String name,int tr,String b)
	{
		System.out.println("Booking number "+bookno);
		
		System.out.println("Customer number "+cust.no);
		
		System.out.println("Booking Name "+name);
		
		System.out.println("Fare is "+ ff);
		
		System.out.println("Total cost of transportation is "+ tr);
		
	}
	
	
	public int getFare()
	{
		return ff;
	}
	
	public String getName()
	{
		return cust.name;
	}
	

//public String toString() {
//	   return new StringBuffer(" Book No : ")
//	   .append(this.bookno).toString();
//}
}
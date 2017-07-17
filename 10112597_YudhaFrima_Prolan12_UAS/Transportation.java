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
import java.util.Scanner;

public class Transportation extends Service{
	
	Transportation()
	{
		super();
	}
	
        @Override
	public void setDetails()
	{
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter type of transportation(1/2/3)");
		type = in.nextInt();
		System.out.println("Enter number of people(1/2)");
		quantity = in.nextInt();
		
		if(type==1)
			cost=100;
		else
		{
		if(type==2)
			cost=200;
		else
		{
		if(type==3)
			cost=300;
		else
			cost=0;
		}
		}
	}
	
        @Override
	public int getTotalCost()
	{
		return quantity*cost;
	}
	
        @Override
	public boolean getStatus()
	{
		return status;
	}
}

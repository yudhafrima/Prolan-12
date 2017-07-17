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
public class Fare {

	public int farecalculator(int hours,int rate,int s)
	{
			if(s==1)
			{
				return hours*rate;
			}
			
			if(s==2)
			{
				return hours*rate*2;
			}
	
	return 0;
}
}

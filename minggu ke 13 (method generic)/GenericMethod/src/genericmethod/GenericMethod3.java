/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package genericmethod;


public class GenericMethod3 {
    String status;
    int speed;
    float temperature;
    
    void checkTemperature() {
        if (temperature > 660) {
            status = "returning home";
            speed = 5;
        }
    }
    
void showAttributes(){
    System.out.println("Status : " +status);
    System.out.println("Speed :" +speed);
    System.out.println("Temperature :" +temperature);
}    
 
public static void main (String[] arguments) {
    KabutakuRobot dante = new KabutakuRobot();
    dante.status = "exploring";
    dante.speed = 2;
    dante.temperature = 510;
    
    dante.showAttributes();
    System.out.println("Increasing speed to 3.");
    dante.speed = 3;
    dante.showAttributes();
    System.out.println("Changing temperature to 670.");
    dante.speed = 670;
    dante.showAttributes();
    System.out.println("Checking the temperature.");
    dante.checkTemperatur ();
    dante.showAttributes();
}
}

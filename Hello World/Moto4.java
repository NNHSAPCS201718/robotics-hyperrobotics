

/**
 * Write a description of class Motor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import lejos.nxt.*;
import lejos.util.*;
public class Moto4
{
    // instance variables - replace the example below with your own
    public static void main( String[] args )
    {
        System.out.println( "Program 4" );
        
        Motor.A.rotate(-1440,true);
        while(Motor.A.isMoving())
        {
            System.out.println(Motor.A.getTachoCount());
            if(Button.LEFT.isDown())
            {
                Motor.A.stop();
            }
        }
        
        System.out.println(Motor.A.getTachoCount());
        Button.waitForAnyPress();
    }
}

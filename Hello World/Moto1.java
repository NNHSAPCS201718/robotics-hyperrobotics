
/**
 * Write a description of class Motor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import lejos.nxt.*;
import lejos.util.*;
public class Moto1
{
    // instance variables - replace the example below with your own
    public static void main( String[] args )
    {
        System.out.println( "Program 2" );
        Motor.A.setSpeed(720);
        Motor.A.forward();
        Delay.msDelay(2000);
        System.out.println(Motor.A.getTachoCount());
        Motor.A.stop();
        System.out.println(Motor.A.getTachoCount());
        Motor.A.backward();
        while(Motor.A.getTachoCount()>0)
        {System.out.println(Motor.A.getTachoCount());}
        System.out.println(Motor.A.getTachoCount());
        Motor.A.stop();
        System.out.println(Motor.A.getTachoCount());
        Button.waitForAnyPress();

        
    }
}

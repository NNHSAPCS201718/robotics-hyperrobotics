
/**
 * Write a description of class Motor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import lejos.nxt.*;
public class Moto
{
    // instance variables - replace the example below with your own
    public static void main( String[] args )
    {
        System.out.println( "Program 1" );
        Button.waitForAnyPress();
        Motor.A.forward();
        System.out.println("Forward");
        Button.waitForAnyPress();
        Motor.B.backward();
        Motor.A.backward();
        System.out.println("Backwards");
        Button.waitForAnyPress();
        Motor.A.stop();
        Motor.B.stop();
        
    }
}

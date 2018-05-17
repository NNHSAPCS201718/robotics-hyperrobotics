
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
        System.out.println( "Hello World" );
        Motor.B.forward();
        Motor.C.forward();
        Button.waitForAnyPress();
        
    }
}

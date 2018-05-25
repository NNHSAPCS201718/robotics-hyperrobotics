
/**
 * Write a description of class Motor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import lejos.nxt.*;
import lejos.util.*;
public class Moto3
{
    // instance variables - replace the example below with your own
    public static void main( String[] args )
    {
        System.out.println( "Program 3" );
        Motor.A.rotate(1440);
        System.out.println(Motor.A.getTachoCount());
        Motor.A.rotateTo(0);
        System.out.println(Motor.A.getTachoCount());
        Button.waitForAnyPress();
    }
}

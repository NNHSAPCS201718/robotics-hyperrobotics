

/**
 * Write a description of class SquareTracer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import lejos.nxt.*;
import lejos.robotics.navigation.*;
import lejos.util.*;
public class CircularPath
{
    public static void main( String[] args )
    {
        System.out.println( "Program 3" );
        DifferentialPilot d = new DifferentialPilot(5.6, 11.5, Motor.A, Motor.B);
        
        d.steer(50,360);
        Button.waitForAnyPress();
    }
}

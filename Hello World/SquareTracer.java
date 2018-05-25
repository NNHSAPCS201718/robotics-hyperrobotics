
/**
 * Write a description of class SquareTracer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import lejos.nxt.*;
import lejos.robotics.navigation.*;
import lejos.util.*;
public class SquareTracer
{
    public static void main( String[] args )
    {
        System.out.println( "SquareTracer" );
        DifferentialPilot d = new DifferentialPilot(5.6, 11.5, Motor.A, Motor.B);
        for(int i=0;i<4;i++)
        {
            d.travel(30);
            d.rotate(90);
        }
    }
}

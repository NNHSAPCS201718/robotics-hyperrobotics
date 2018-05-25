


/**
 * Write a description of class Motor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import lejos.nxt.*;
import lejos.util.*;
public class Moto5
{
    // instance variables - replace the example below with your own
    public static void main( String[] args )
    {
        System.out.println( "Program 5" );
        Motor.A.setSpeed(720);
        Motor.B.setSpeed(720);
        Motor.C.setSpeed(720);
        int a=Motor.A.getTachoCount();

        for(int i=0;i<8;i++)
        {   
            Motor.A.rotate(720,true);
            Motor.B.rotate(720,true);
            Motor.C.rotate(720,true);
            while(Motor.A.getTachoCount()-a<720)
            {
                Delay.msDelay(200);
                int ma=Motor.A.getTachoCount();
                int mb=Motor.B.getTachoCount();
                int mc=Motor.C.getTachoCount();
                System.out.println(ma+" "+mb+" "+mc);
            }
            a+=720;
        }
        Button.waitForAnyPress();
    }
}

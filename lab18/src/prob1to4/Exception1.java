package prob1to4;

import java.util.Scanner;

public class Exception1 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");

        int i = myScanner.nextInt();
        try{
            System.out.println( 2/i );
        }
        catch (Exception e1) {
            System.out.println("Exception");
        }
        /*catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }*/
        finally {

        }
    }
}


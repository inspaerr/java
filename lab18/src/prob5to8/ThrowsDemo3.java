package prob5to8;

import java.util.Scanner;

public class ThrowsDemo3 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = "";
        while (true) {
            try{
                printDetails( key );
                break;
            } catch (Exception e) {
                System.out.println("Caught an exception: " + e.toString());
                System.out.println("Try again");
            }
            key = myScanner.next();
        }
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }
    private String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }

    public static void main(String[] args) {
        ThrowsDemo3 td3 = new ThrowsDemo3();
        td3.getKey();
    }
}


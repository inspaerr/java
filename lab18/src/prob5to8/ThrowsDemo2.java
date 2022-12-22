package prob5to8;

import java.util.Scanner;

public class ThrowsDemo2 {
    public void getKey() {
        String key = "";
        //Scanner myScanner = new Scanner( System.in);
        //String key = myScanner.next();
        try{
            printDetails( key );
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.toString());
        }
    }
    public void printDetails(String key) throws Exception {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }

    public static void main(String[] args) {
        ThrowsDemo2 td2 = new ThrowsDemo2();
        td2.getKey();
    }
}



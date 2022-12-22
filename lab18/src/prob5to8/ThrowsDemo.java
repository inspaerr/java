package prob5to8;

public class ThrowsDemo {
    public void printMessage(Message message) {
        //String message = getDetails(key);
        //System.out.println( message );
        try{
            System.out.println("data for " + message.getText());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" ); //прога ломается
        }
        return "data for" + key;
    }
}


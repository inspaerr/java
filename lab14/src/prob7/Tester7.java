package prob7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester7 {
    public static void main(String[] args) {
        String str = "F032_Password"; //smart_pass,
        String regex = "(?=^[a-zA-Z0-9_]{8,}$)(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(str);
        if (m.matches()){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}

package prob4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester4 {
    public static void main(String[] args) {
        String str = "6 / 5 – 2 * 9"; //(1 + 8) – 9 / 4
        String regex = "[0-9]+[ ]*[+]";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(str);
        if (m.find()){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}

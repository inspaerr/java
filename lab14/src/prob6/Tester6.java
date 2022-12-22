package prob6;
//не работает
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester6 {
    public static void main(String[] args) {
        String str = "myhost@@@com.ru"; //, user@example.com
        String regex = "(\\w+)@(\\w+\\.)(\\w+)";
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
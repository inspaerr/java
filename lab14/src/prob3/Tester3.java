package prob3;
import java.util.regex.*;

public class Tester3 {
    public static void main(String[] args) {
        // проверка строки на соответствие шаблону
        String regex = "(\\d+\\.)(\\w+{2,3})*";
        String s = "Цены 30.06 USD 50.307 RUS 60.12 CHF 11,23" ;
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(s);
        System.out.println("Список цен");
        while (m1.find()) {
            System.out.println(m1.group());}
    }
}

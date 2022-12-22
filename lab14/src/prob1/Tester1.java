package prob1;

import java.util.regex.Pattern;

public class Tester1 {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("\\d+\\s?");//пробел и цифры
        String[] words = p1.split("sonya33 dasha290java");
        for (String word : words)
            System.out.println(word);
        System.out.println("----------");
        Pattern p2 = Pattern.compile("\\W");//не цифры
        String[] words2 = p2.split("MIREA&2022@_");
        for (String word2 : words2)
            System.out.println(word2);
    }
}

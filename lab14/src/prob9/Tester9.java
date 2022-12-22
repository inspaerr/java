package prob9;

import java.util.HashMap;
import java.util.Map;

public class Tester9 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        String text = "Curabitur porttitor massa eros. Cras pellentesque dolor ornare orci fringilla laoreet. Integer dapibus, dui quis rhoncus varius, tortor dui bibendum justo, non tincidunt nisi dui id elit. Ut sodales, tellus eget malesuada malesuada, sem neque suscipit erat, eu bibendum lacus urna et velit. Duis sit amet placerat nulla. Morbi cursus sapien eu nunc vehicula vestibulum. Sed tristique ligula ipsum, auctor euismod metus imperdiet eu. Suspendisse vel porttitor sem. Nullam malesuada dapibus vestibulum. Integer luctus massa sapien, at posuere tortor cursus non. Nulla vitae ligula porta enim maximus aliquam eget quis elit. Nam sed felis sed dolor efficitur consectetur id eu est. Maecenas ac sem in turpis egestas mattis id quis purus. Duis consequat, lectus venenatis dictum tristique, orci justo commodo ante, quis venenatis odio augue sed mauris.";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        for(Character character : map.keySet()){
            System.out.println(character + " " + map.get(character).toString());
        }
    }
}

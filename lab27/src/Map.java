import java.util.HashMap;
import java.util.HashSet;

public class Map {
    public static void main(String[] args) {
        var map = createMap();
        System.out.println(map);
        System.out.println("Кол-во одинаковых имён: " + getSameFirstNameCount(map));
        System.out.println("Кол-во одинаковых фамилий: " + getSameLastNameCount(map));
    }

    private static HashMap<String, String> createMap() {
        var map = new HashMap<String, String>();
        map.put("Канчура", "Мария");
        map.put("Иванов", "Иван");
        map.put("Кубанцева", "Регина");
        map.put("Петров", "Петр");
        map.put("Сергеев", "Сергей");
        map.put("Александров", "Егор");
        map.put("Петров", "Иван");
        map.put("Алексеев", "Егор");
        map.put("Кубанцева", "Дарья");
        map.put("Канчура", "Софья");
        return map;
    }

    private static int getSameLastNameCount(HashMap<String, String> map) {
        var lastNameSet = new HashSet<String>();
        for (var entry : map.entrySet())
            lastNameSet.add(entry.getKey());
        return map.entrySet().size() - lastNameSet.size();
    }

    private static int getSameFirstNameCount(HashMap<String, String> map) {
        var firstNameSet = new HashSet<String>();
        for (var entry : map.entrySet())
            firstNameSet.add(entry.getValue());
        return map.entrySet().size() - firstNameSet.size();
    }
}

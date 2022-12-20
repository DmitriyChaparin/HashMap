import java.util.LinkedHashMap;
import java.util.Map;

public class mapTest2 {
    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");

        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry.getKey()+" : "+ integerStringEntry.getValue());
        }

    }
}

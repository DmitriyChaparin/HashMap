import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {


    public static void main(String[] args) {

        Map<String, List<Integer>> map = new HashMap<>();

        map.put("str1", List.of(10, 11, 12));
        map.put("str2", List.of(100, 110, 120));
        map.put("str3", List.of(210, 211, 212));
        map.put("str4", List.of(310, 311, 312));
        map.put("str5", List.of(140, 141, 142));

        Map<String, Integer> map1 = new HashMap<>();
        for (Map.Entry<String,List<Integer>>stringListEntry:map.entrySet()) {
            map1.put(stringListEntry.getKey(), sumElements(stringListEntry.getValue()));
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : map1.entrySet()) {
            System.out.println(stringIntegerEntry.getKey()+" : "+stringIntegerEntry.getValue());
        }
    }

    public static Integer sumElements(List<Integer> list) {
        Integer sum= 0;
        for (Integer element: list) {
            sum+=element;
        }
        return sum;
    }


}

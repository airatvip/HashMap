import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    private Map<String, Integer> map = new HashMap<>();

    public void add(String K, Integer V) {
        if (map.containsKey(K) && map.containsValue(V)) {
            throw new RuntimeException("Такие значения уже есть в коллекции");
        } else map.put(K, V);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        {
            for (Map.Entry<String, Integer> s : map.entrySet()) {
                builder.append(s.getKey() + "->" + s.getValue() + "\n");
            }
        }
        return builder.toString();
    }
}




package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample6 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("one", 1);
        linkedHashMap.put("two", 2);
        linkedHashMap.put("three", 3);

        // Итерирование элементов в LinkedHashMap
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Ключ: " + key + ", Значение: " + value);
        }
    }
}
package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Collection;

public class LinkedHashMapExample5 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("one", 1);
        linkedHashMap.put("two", 2);
        linkedHashMap.put("three", 3);

        // Итерирование элементов в порядке добавления с использованием entrySet()
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (Integer value : linkedHashMap.values()) {
            System.out.println(value);
        }

        for (String key : linkedHashMap.keySet()) {
            System.out.println(key);
        }
    }
}
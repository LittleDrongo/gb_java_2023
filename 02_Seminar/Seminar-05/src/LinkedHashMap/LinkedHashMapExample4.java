package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample4 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> cache = new LinkedHashMap<>(5, 0.75f, true) {

            @Override //Переопределение метода remove
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size() > 5;
            }
        };

        // Добавляем элементы в кеш
        for (int i = 0; i < 10; i++) {
            cache.put("Key" + i, i);
        }


        // После добавления 10 элементов, останутся только последние 5, так как старые автоматически удаляются
        System.out.println(cache);
    }
}
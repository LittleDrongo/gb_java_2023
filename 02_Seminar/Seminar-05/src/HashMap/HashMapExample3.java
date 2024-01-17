package HashMap;

import java.util.HashMap;

public class HashMapExample3 {
    public static void main(String[] args) {
        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Анна", 25);
        ageMap.put("Иван", 30);
        ageMap.put("Мария", 28);

        // Заменяем возраст Ивана
        ageMap.replace("Иван", 32);
        System.out.println("Новый возраст Ивана: " + ageMap.get("Иван"));
    }
}

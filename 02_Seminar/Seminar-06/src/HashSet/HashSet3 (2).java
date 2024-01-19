package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet3 {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        // 1. Иттератор позволяет удалять элементы объекта.
        // 2. Иттератор позволяет иметь больший контроль над иттерацией.
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }

        //hasNext
        //next
    }
}

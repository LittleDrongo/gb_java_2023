package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet7 {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        ArrayList<String> retainList = new ArrayList<>();
        retainList.add("green");
        retainList.add("yellow");

        colors.retainAll(retainList); // Оставляем в colors только элементы из retainList

        System.out.println("Retained colors: " + colors); // Выведет: Retained colors: [green]


    }
}

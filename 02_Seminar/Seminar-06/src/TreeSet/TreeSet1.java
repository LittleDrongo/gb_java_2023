package TreeSet;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {

                TreeSet<Integer> numbers = new TreeSet<>();

                // Добавляем элементы в TreeSet
                numbers.add(10);
                numbers.add(5);
                numbers.add(15);
                numbers.add(3);
                numbers.add(7);

                // Используем методы TreeSet

                // first(): Возвращает первый (наименьший) элемент
                int firstElement = numbers.first();
                System.out.println("First Element: " + firstElement); // Выведет: First Element: 3

                // last(): Возвращает последний (наибольший) элемент
                int lastElement = numbers.last();
                System.out.println("Last Element: " + lastElement); // Выведет: Last Element: 15

                // lower(E e): Возвращает наибольший элемент, который меньше заданного элемента
                int lowerThanEight = numbers.lower(8);
                System.out.println("Lower than 8: " + lowerThanEight); // Выведет: Lower than 8: 7
                // 1 2 3 4 5 6 7 [8] 9 10 11 12 13 14

                // higher(E e): Возвращает наименьший элемент, который больше заданного элемента
                int higherThanTwelve = numbers.higher(12);
                System.out.println("Higher than 12: " + higherThanTwelve); // Выведет: Higher than 12: 15

                // ceiling(E e): Возвращает наименьший элемент, который больше или равен заданному элементу
                int ceilingForSix = numbers.ceiling(6);
                System.out.println("Ceiling for 6: " + ceilingForSix); // Выведет: Ceiling for 6: 7
            }
        }

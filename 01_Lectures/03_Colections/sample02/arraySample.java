import java.util.ArrayList;

public class arraySample {
    public static void main(String[] args) {

        System.out.println("o");
        
        // ЯВНЫЙ ТИП ДАННЫХ В СПИСКЕ (ОБОБЩЕНИЕ)
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(2809);


        //НЕЯВНЫЙ ТИП ДАННЫХ В СПИСКЕ
        ArrayList list = new ArrayList();
        list.add(2809);
        list.add("dasdasdas");

        for (Object o : list) {
            System.out.println(o);
        }

        
    }
}

// └── <<interface>> Collection
// ├── <<interface>> Set
// │ ├── HasSet
// │ ├── LinkedHashSet
// │ └── <<interface>> SortedSet
// │ └── <<interface>> NavigableSet
// │ └── TreeSet
// │
// ├── <<interface>> List
// │ ├── ArrayList
// │ └── Vector
// │
// ├── <<interface>> Queue
// │ ├── LinkedList
// │ └── PriorityQueue

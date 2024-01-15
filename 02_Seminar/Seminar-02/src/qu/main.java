package qu;

import java.util.PriorityQueue;

public class main {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(23);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }
}

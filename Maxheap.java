import java.util.Comparator;
import java.util.PriorityQueue;
public class Maxheap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(5);
        pq.add(10);
        pq.add(3);
        pq.add(1);       
        System.out.println("maxheap:" + pq);
        System.out.println("deleted:" + pq.poll()); 
        System.out.println(pq.peek());
    }
}
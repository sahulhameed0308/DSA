import java.util.Comparator;
import java.util.PriorityQueue;
public class minheap {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.naturalOrder());
        p.add(5);
        p.add(10);
        p.add(3);
        p.add(1);
        System.out.println("minheap:" + p);
        System.out.println("deleted:" + p.poll()); 
        System.out.println(p.peek());
    }
}
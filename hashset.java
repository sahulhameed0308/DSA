import java.util.*;
class hashset {
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(20);
        System.out.println("HashSet: " + set);
        set.remove(30);
        System.out.println("After removing: " + set);
        System.out.println("Contains 20: " + set.contains(20));
        System.out.println("Size: " + set.size());
    }
}
import java.util.*;
class Treeset {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        System.out.println("TreeSet: " + set);
        set.remove("Mango");
        System.out.println("After deletion: " + set);
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
        System.out.println("Contains Apple: " + set.contains("Apple"));
        System.out.println("Size: " + set.size());
    }
}
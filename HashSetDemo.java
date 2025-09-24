import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        // 1) Create a HashSet
        HashSet<String> set = new HashSet<>();

        // 2) add(E e)
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // duplicate ignored
        System.out.println("After add(): " + set);

        // 3) contains(Object o)
        System.out.println("Contains 'Banana'? " + set.contains("Banana"));

        // 4) remove(Object o)
        set.remove("Banana");
        System.out.println("After remove('Banana'): " + set);

        // 5) size()
        System.out.println("Size of set: " + set.size());

        // 6) isEmpty()
        System.out.println("Is set empty? " + set.isEmpty());

        // 7) addAll(Collection c)
        HashSet<String> set2 = new HashSet<>();
        set2.add("Mango");
        set2.add("Grapes");
        set.addAll(set2);
        System.out.println("After addAll(set2): " + set);

        // 8) removeAll(Collection c)
        set.removeAll(set2);
        System.out.println("After removeAll(set2): " + set);

        // 9) retainAll(Collection c)
        set.add("Mango");
        set.add("Kiwi");
        set2.add("Kiwi");
        set.retainAll(set2); // keeps only common elements
        System.out.println("After retainAll(set2): " + set);

        // 10) clear()
        set.clear();
        System.out.println("After clear(): " + set);

        // 11) Iterating with for-each
        set2.add("Orange");
        set2.add("Peach");
        System.out.print("Iterating with for-each: ");
        for (String fruit : set2) {
            System.out.print(fruit + " ");
        }

        // 12) Iterating with Iterator
        System.out.print("\nIterating with Iterator: ");
        Iterator<String> itr = set2.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}

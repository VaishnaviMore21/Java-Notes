import java.util.Vector;

public class VectorMethodsDemo {
    public static void main(String[] args) {
        // 1) Create a Vector
        Vector<String> v = new Vector<>();

        // 2) add(E e)
        v.add("Apple");
        v.add("Banana");
        v.add("Cherry");
        System.out.println("After add(E e): " + v);

        // 3) add(int index, E element)
        v.add(1, "Mango");
        System.out.println("After add(index, element): " + v);

        // 4) addElement(E obj)
        v.addElement("Orange");
        System.out.println("After addElement(): " + v);

        // 5) capacity()
        System.out.println("Capacity of vector: " + v.capacity());

        // 6) size()
        System.out.println("Size of vector: " + v.size());

        // 7) contains(Object obj)
        System.out.println("Contains 'Banana'? " + v.contains("Banana"));
        System.out.println("Contains 'Grapes'? " + v.contains("Grapes"));

        // 8) indexOf(Object obj)
        System.out.println("Index of 'Cherry': " + v.indexOf("Cherry"));
        System.out.println("Index of 'Grapes': " + v.indexOf("Grapes"));

        // 9) get(int index)
        System.out.println("Element at index 2: " + v.get(2));

        // 10) set(int index, E element)
        v.set(2, "Papaya");
        System.out.println("After set(index, element): " + v);

        // 11) remove(int index)
        v.remove(3); // removes element at index 3
        System.out.println("After remove(index): " + v);

        // 12) remove(Object obj)
        boolean removed = v.remove("Mango");
        System.out.println("Removed 'Mango'? " + removed);
        System.out.println("After remove(Object): " + v);

        // 13) isEmpty()
        System.out.println("Is vector empty? " + v.isEmpty());

        // 14) removeAllElements()
        v.removeAllElements();
        System.out.println("After removeAllElements(): " + v);
        System.out.println("Is vector empty now? " + v.isEmpty());
    }
}

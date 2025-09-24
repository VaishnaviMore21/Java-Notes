import java.util.Collection;
import java.util.ArrayList;

public class CollectionInterfaceDemo {
    public static void main(String[] args) {
        // Collection interface reference pointing to ArrayList
        Collection<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Collection of names: " + names);
        System.out.println("Number of names: " + names.size());
        System.out.println("Contains Alice? " + names.contains("Alice"));
    }
}

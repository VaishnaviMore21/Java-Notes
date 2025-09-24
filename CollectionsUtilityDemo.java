import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilityDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        System.out.println("Original numbers: " + numbers);

        // Using Collections utility methods
        Collections.sort(numbers);  // sort
        System.out.println("Sorted numbers: " + numbers);

        Collections.reverse(numbers); // reverse
        System.out.println("Reversed numbers: " + numbers);

        int max = Collections.max(numbers); // find max
        System.out.println("Maximum number: " + max);
    }
}

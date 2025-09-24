import java.util.Stack;

public class StackMethodsDemo {
    public static void main(String[] args) {
        // 1) Create a stack
        Stack<String> stack = new Stack<>();

        // 2) push(E item) → Add element on top
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("After push: " + stack);

        // 3) peek() → Returns top element without removing
        System.out.println("Top element (peek): " + stack.peek());

        // 4) pop() → Removes and returns the top element
        String popped = stack.pop();
        System.out.println("Popped element: " + popped);
        System.out.println("After pop: " + stack);

        // 5) search(Object o) → 1-based position from top
        int pos = stack.search("Apple");
        System.out.println("Position of 'Apple': " + pos);

        // 6) empty() → true if stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // 7) size() → number of elements
        System.out.println("Size of stack: " + stack.size());

        // 8) contains(Object o) → check if element exists
        System.out.println("Contains 'Banana'? " + stack.contains("Banana"));

        // 9) get(int index) → Access by index (inherited from Vector)
        System.out.println("Element at index 0: " + stack.get(0));

        // 10) set(int index, E element) → Modify element
        stack.set(0, "Mango");
        System.out.println("After set(0, 'Mango'): " + stack);

        // 11) remove(int index) → Remove by index
        stack.remove(0);
        System.out.println("After remove(index 0): " + stack);

        // 12) clear() → Remove all
        stack.clear();
        System.out.println("After clear(): " + stack);

        // 13) empty() again
        System.out.println("Is stack empty now? " + stack.empty());
    }
}

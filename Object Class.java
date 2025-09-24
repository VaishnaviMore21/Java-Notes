This image shows the methods of the Object class in Java. The Object class is the root superclass of all classes in Java, so every class inherits these methods. Here’s a breakdown with definitions and example code for each:
________________________________________
1. getClass()
•	Definition: Returns the runtime class of the object.
•	Example:
public class Test {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s.getClass());  // Output: class java.lang.String
    }
}
________________________________________
2. hashCode()
•	Definition: Returns a hash code value for the object (used in hashing like HashMap).
•	Example:
public class Test {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s.hashCode()); // Example output: 69609650
    }
}
________________________________________
3. wait()
•	Definition: Causes the current thread to wait until another thread calls notify() or notifyAll() on the same object.
•	Example:
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();
        synchronized(obj) {
            obj.wait(); // Waits indefinitely until notified
        }
    }
}
________________________________________
4. toString()
•	Definition: Returns a string representation of the object. Default: ClassName@hashcode.
•	Example:
public class Test {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj.toString()); // Output: java.lang.Object@<hashcode>
    }
}
________________________________________
5. clone()
•	Definition: Creates and returns a copy of the object. Class must implement Cloneable.
•	Example:
class Person implements Cloneable {
    String name;
    Person(String name) { this.name = name; }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Vaish");
        Person p2 = (Person)p1.clone();
        System.out.println(p2.name); // Output: Vaish
    }
}
________________________________________
6. equals(Object obj)
•	Definition: Compares two objects for equality. Default: compares memory addresses.
•	Example:
public class Test {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1.equals(s2)); // Output: true
    }
}
________________________________________
7. finalize()
•	Definition: Called by the garbage collector before destroying an object.
•	Example:
class TestClass {
    protected void finalize() {
        System.out.println("Object is garbage collected");
    }
}

public class Test {
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t = null;
        System.gc(); // Suggests JVM to call garbage collector
    }
}
________________________________________
8. notify()
•	Definition: Wakes up one thread waiting on the object's monitor.
•	Example:
Object obj = new Object();
synchronized(obj) {
    obj.notify(); // Wakes up one waiting thread
}
________________________________________
9. notifyAll()
•	Definition: Wakes up all threads waiting on the object's monitor.
•	Example:
Object obj = new Object();
synchronized(obj) {
    obj.notifyAll(); // Wakes up all waiting threads
}
________________________________________
If you want, I can create a single Java program demonstrating all these Object class methods together for easy testing. It’ll be like a full “Object Class Demo.”
Do you want me to do that?


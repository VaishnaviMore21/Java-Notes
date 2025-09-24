public class WrapperDemo {
    public static void main(String[] args) {
        // 1. Boxing (Primitive → Wrapper)
        int num = 50;
        Integer numObj = Integer.valueOf(num); // manual boxing
        System.out.println("Wrapper Object (manual boxing): " + numObj);

        // 2. Auto-boxing
        Integer autoBoxed = num; // automatic boxing
        System.out.println("Wrapper Object (auto-boxing): " + autoBoxed);

        // 3. Unboxing (Wrapper → Primitive)
        int unboxed = numObj.intValue(); // manual unboxing
        System.out.println("Primitive value (manual unboxing): " + unboxed);

        // 4. Auto-unboxing
        int autoUnboxed = numObj; // automatic unboxing
        System.out.println("Primitive value (auto-unboxing): " + autoUnboxed);

        // 5. Using Wrapper Methods
        String str = "12345";
        int parsedInt = Integer.parseInt(str); // string → primitive
        System.out.println("Parsed int: " + parsedInt);

        Integer objFromString = Integer.valueOf(str); // string → wrapper object
        System.out.println("Integer object from string: " + objFromString);

        // 6. Comparison
        Integer a = 100;
        Integer b = 200;
        System.out.println("Comparison result (a.compareTo(b)): " + a.compareTo(b));

        // 7. Converting Wrapper → String
        String s = a.toString();
        System.out.println("Wrapper to String: " + s);

        // 8. Using Wrapper in Collections
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(10); // auto-boxed
        list.add(20);
        list.add(30);

        System.out.println("ArrayList of Integer objects: " + list);
    }
}

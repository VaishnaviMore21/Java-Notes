public class TypeConversionDemo {
    public static void main(String[] args) {
        // ---------- Widening Conversion (Implicit) ----------
        System.out.println("----- Widening Conversion -----");
        int intVal = 50;
        long longVal = intVal;        // int → long
        float floatVal = longVal;     // long → float
        double doubleVal = floatVal;  // float → double

        System.out.println("Int value: " + intVal);
        System.out.println("Long value (int → long): " + longVal);
        System.out.println("Float value (long → float): " + floatVal);
        System.out.println("Double value (float → double): " + doubleVal);

        // ---------- Narrowing Conversion (Explicit) ----------
        System.out.println("\n----- Narrowing Conversion -----");
        double d = 123.456;
        float f = (float) d;  // double → float
        long l = (long) f;     // float → long
        int i = (int) l;       // long → int
        short s = (short) i;   // int → short
        byte b = (byte) s;     // short → byte

        System.out.println("Double value: " + d);
        System.out.println("Float value (double → float): " + f);
        System.out.println("Long value (float → long): " + l);
        System.out.println("Int value (long → int): " + i);
        System.out.println("Short value (int → short): " + s);
        System.out.println("Byte value (short → byte): " + b);
    }
}

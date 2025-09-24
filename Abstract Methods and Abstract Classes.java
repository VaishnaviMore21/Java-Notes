Here’s a concise and structured definition of **Abstract Method** and **Abstract Class** based on your lecture notes:

---

### **Abstract Method**

* An **abstract method** is a method that is declared without an implementation (no method body `{ }`).
* It is used in inheritance when we want to **force subclasses to provide their own implementation** of certain methods.
* Syntax:

```java
abstract <returnType> methodName(parameters);
```

**Properties:**

1. It does **not have a body** (unimplemented method).
2. Must be **overridden in the subclass**.
3. Ensures that a subclass provides specific behavior defined in the superclass.

---

### **Abstract Class**

* An **abstract class** is a class that contains **one or more abstract methods**.
* Must be declared using the `abstract` keyword:

```java
abstract class ClassName { }
```

**Properties:**

1. **Cannot create objects** of an abstract class, but **can create references**.
2. Can have **both abstract and concrete methods**.
3. Called a **“partially unimplemented class”**.

---

### **Example Program**

```java
abstract class Shape {
    double dim1, dim2;
    Shape(double a, double b) { 
        dim1 = a; 
        dim2 = b; 
    }
    abstract void area();  // abstract method
}

class Rect extends Shape {
    Rect(double a, double b) { 
        super(a,b); 
    }
    void area() { 
        System.out.println("Area of Rectangle = " + (dim1 * dim2)); 
    }
}

class Triangle extends Shape {
    Triangle(double a, double b) { 
        super(a,b); 
    }
    void area() { 
        System.out.println("Area of Triangle = " + (dim1 * dim2 / 2)); 
    }
}

class AbstractTest {
    public static void main(String[] args) {
        Shape s;  // Reference of abstract class
        // s = new Shape(10,10); // Error: cannot create object of abstract class
        s = new Rect(10,9);
        s.area();  // calls Rect area()
        s = new Triangle(10,8);
        s.area();  // calls Triangle area()
    }
}
```

**Output:**

```
Area of Rectangle = 90.0
Area of Triangle = 40.0
```

---

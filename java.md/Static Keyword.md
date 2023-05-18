# Static Keyword in Java?

The static keyword in Java is used to declare variables, methods, and nested classes that belong to the class itself, rather than to any instance of the class. This means that there is only one copy of the static variable or method, shared by all instances of the class.

Static variables are declared with the keyword `static` before the variable name. They are initialized to their default value (0 for integers, false for booleans, and null for objects) when the class is loaded. Static variables can be accessed using the class name, without having to create an instance of the class.

Static methods are declared with the keyword `static` before the method name. They can be accessed using the class name, without having to create an instance of the class. Static methods cannot access instance variables or methods.

Static nested classes are nested classes that are declared with the keyword `static`. They are not associated with any particular instance of the outer class.

Here are some examples of static variables, methods, and nested classes:

```java
// Static variable
public class MyClass {
    private static int count = 0;

    public MyClass() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

// Static method
public class MyClass {
    public static void printHello() {
        System.out.println("Hello!");
    }
}

// Static nested class
public class MyClass {
    public static class NestedClass {
        // This method can access static variables and methods of MyClass
        public void doSomething() {
            System.out.println(MyClass.count);
            MyClass.printHello();
        }
    }
}
```

The static keyword can be used to improve the performance of your code by reducing the number of objects that need to be created. It can also be used to make your code more modular and easier to maintain.

# Define wrapper class in java with example?



In Java, a wrapper class is a class that provides a way to use primitive data types (such as int, float, and double) as objects. Wrapper classes are used to convert primitive data types into objects, and vice versa.

The eight primitive data types in Java are:

- boolean
- byte
- char
- short
- int
- long
- float
- double

Each of these primitive types has a corresponding wrapper class:

- Boolean
- Byte
- Character
- Short
- Integer
- Long
- Float
- Double

Wrapper classes are useful in situations where you need to pass primitive types as objects, for example, when you need to store them in a collection or pass them as arguments to a method that accepts objects. 

Wrapper classes also provide useful methods for working with primitive types. For example, the Integer class provides methods like parseInt() and toString() for working with integer values.

Here's an example of using a wrapper class:

          ```
          int num = 42; // primitive type
          Integer numWrapper = Integer.valueOf(num); // wrapper object

          System.out.println(num); // prints 42
          System.out.println(numWrapper); // prints 42
          ```

## What is Object-Oriented Programming (OOP)?

Object-Oriented Programming is a programming paradigm that organizes code around objects, which are instances of
classes. It emphasizes the concepts of encapsulation, inheritance, polymorphism, and abstraction to create modular and
reusable code.

## What are the key principles of OOP?

The key principles of OOP are:

- **Encapsulation**: Bundling data and methods into a single unit (class) and hiding the internal details from outside.
- **Inheritance**: Allowing classes to inherit properties and behaviors from other classes, promoting code reuse.
- **Polymorphism**: Providing the ability for objects of different classes to respond to the same message (method) in
  different ways.
- **Abstraction**: Simplifying complex systems by breaking them down into manageable and abstract representations.

## What is a class in Java?

A class in Java is a blueprint or template that defines the properties (data) and behaviors (methods) that objects of
that class will have. It acts as a blueprint for creating objects.

## What is an object in Java?

An object in Java is an instance of a class. It represents a real-world entity or concept and encapsulates its state and
behavior.

## What is the difference between a class and an object?

A class is a template or blueprint that defines the structure and behavior of objects. It is used to create objects. An
object, on the other hand, is an instance of a class that has its own state and behavior.

## Explain the concepts of encapsulation and data hiding.

Encapsulation is the practice of bundling data and methods within a class, hiding the internal details from outside. It
helps in achieving data abstraction and protects data from unauthorized access. Data hiding refers to making the
internal data of a class private, so it can only be accessed through public methods (getters and setters).

## What is inheritance in Java? How does it support code reusability?

Inheritance is a mechanism in Java that allows a class (subclass) to inherit properties and methods from another class (
superclass). The subclass can extend the functionality of the superclass and reuse its code. It promotes code
reusability, as common characteristics and behaviors can be defined in a superclass and inherited by multiple
subclasses.

## Differentiate between inheritance and composition.

Inheritance is an "is-a" relationship between classes, where a subclass inherits properties and methods from a
superclass. Composition, on the other hand, is a "has-a" relationship, where a class contains objects of other classes
as members. Inheritance focuses on reusing code and promoting polymorphism, while composition emphasizes building
complex objects using simpler components.

## What is the significance of the "super" keyword in Java?

The "super" keyword in Java is used to refer to the superclass or parent class. It is primarily used to call the
superclass constructor, access superclass variables or methods, and differentiate between superclass and subclass
members with the same name.

## What is method overriding? How does it differ from method overloading?

Method overriding is the ability of a subclass to provide its own implementation of a method that is already defined in
its superclass. The method signature (name and parameters) remains the same. Method overloading, on the other hand, is
the ability to define multiple methods in the same class with the same name but different parameters.

## What is the difference between abstract classes and interfaces?

Abstract classes and interfaces are used to achieve abstraction in Java, but they have some differences:

## An abstract class can have both abstract and non-abstract methods, while an interface can only have abstract methods.

A class can inherit only one abstract class but can implement multiple interfaces.
An abstract class can have instance variables, constructors, and method implementations, while an interface can only
have constant variables and method declarations.

## Explain the concept of polymorphism in Java.

Polymorphism is the ability of objects of different classes to respond to the same message (method call) in different
ways. It allows code to be written in a generic manner, where a single method can behave differently based on the type
of object it operates on. Polymorphism is achieved through method overriding and method overloading.

## What is the difference between static and non-static methods?

Static methods belong to the class itself and can be called without creating an instance of the class. Non-static
methods, on the other hand, belong to instances of the class (objects) and can only be called on those instances. Static
methods can access only static variables and other static methods, while non-static methods can access both static and
non-static variables and methods.

## What is the purpose of the "final" keyword in Java?

The "final" keyword in Java is used to declare that a variable, method, or class cannot be changed or overridden. It
indicates that the value of a variable cannot be modified, a method cannot be overridden in subclasses, or a class
cannot be extended.

## What is the difference between "this" and "super" keywords?

The "this" keyword refers to the current instance of a class, while the "super" keyword refers to the superclass or
parent class. "this" is used to differentiate between instance variables and parameters with the same name, or to invoke
other constructors in the same class. "super" is used to access superclass members, invoke superclass constructors, or
differentiate between superclass and subclass members with the same name.

## What are access modifiers in Java? Provide examples.

Access modifiers in Java define the accessibility or visibility of classes, methods, and variables. There are four
access modifiers:

- **public**: Accessible from anywhere.
- **protected**: Accessible within the same package or subclasses.
- **default (no modifier)**: Accessible within the same package.
- **private**: Accessible only within the same class.

## What is the purpose of the "static" keyword in Java? How is it used?

The "static" keyword in Java is used to declare variables, methods, and nested classes that belong to the class itself,
rather than instances of the class. Static variables have a single shared value across all instances, and static methods
can be called without creating objects. Static nested classes are associated with the outer class rather than instances
of the outer class.

## Explain the concept of method overloading in Java.

Method overloading in Java allows multiple methods in the same class with the same name but different parameters. The
methods must have different parameter types, number, or order. Java determines which method to invoke based on the
arguments passed during the method call. Method overloading provides flexibility and code reusability.

## What is the "toString()" method? Why is it commonly overridden?

The "toString()" method is a built-in method in Java's Object class. It returns a string representation of an object. It
is commonly overridden in classes to provide a meaningful and human-readable representation of the object's state. It is
useful for debugging, logging, and displaying object information.

## What is the significance of the "equals()" and "hashCode()" methods?

The "equals()" method is used to compare the equality of two objects. It is commonly overridden to define the criteria
for object equality based on specific attributes. The "hashCode()" method returns a hash code value for an
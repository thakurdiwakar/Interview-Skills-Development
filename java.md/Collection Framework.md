# Questions On Java Collection Framework

## What is the Java Collection Framework?

- The Java Collection Framework is a set of interfaces, classes, and algorithms provided by Java to store, manipulate,
  and process groups of objects. It provides a standardized way to handle collections of objects in Java.

## What are the main interfaces provided by the Java Collection Framework?

- The main interfaces provided by the Java Collection Framework are:

1. List: An ordered collection that allows duplicate elements.
2. Set: A collection that does not allow duplicate elements.
3. Queue: A collection used to hold elements prior to processing.
4. Map: An object that maps keys to values, where each key is unique.

## What is the difference between the List and Set interfaces?

- The main difference between the List and Set interfaces is that List allows duplicate elements, while Set does not.
  List also maintains the insertion order of elements, whereas Set does not guarantee any specific order.

## What is the difference between ArrayList and LinkedList?

- ArrayList and LinkedList are both implementations of the List interface, but they differ in their underlying data
  structures. ArrayList is backed by a dynamic array, allowing fast random access but slower insertions and deletions.
  LinkedList, on the other hand, is implemented as a doubly-linked list, which provides efficient insertions and
  deletions but slower random access.

## What is the difference between HashSet and TreeSet?

- HashSet and TreeSet are implementations of the Set interface, but they differ in their internal data structures and
  ordering properties. HashSet uses a hash table to store elements and does not maintain any specific order. TreeSet,
  however, is implemented as a self-balancing binary search tree, such as a Red-Black Tree, which orders the elements in
  ascending order or according to a specified Comparator.

## What is the difference between HashMap and HashTable?

- HashMap and HashTable are both implementations of the Map interface, but there are some differences:
    - HashMap is not synchronized, while HashTable is synchronized, which means HashTable is thread-safe but slower in
      performance.
    - HashMap allows null keys and values, whereas HashTable does not allow null keys or values.
    - HashMap is generally preferred over HashTable in non-thread-safe scenarios due to its better performance.

## What is the purpose of the Comparable interface?

The Comparable interface is used to define a natural ordering for objects. By implementing the Comparable interface and
overriding the compareTo() method, objects can be compared and sorted based on their natural order.

## What is the purpose of the Comparator interface?

The Comparator interface is used to define custom comparison logic for objects that do not implement the Comparable
interface. By implementing the Comparator interface and overriding the compare() method, custom sorting behavior can be
defined for objects.

## What is the difference between fail-fast and fail-safe iterators?

Fail-fast iterators (e.g., iterators provided by ArrayList) immediately throw a ConcurrentModificationException if the
underlying collection is structurally modified while iterating. Fail-safe iterators (e.g., iterators provided by
ConcurrentHashMap) create a copy of the underlying collection and iterate over that copy, allowing modifications to the
original collection without throwing exceptions.

## Explain the concept of synchronization in relation to collections.

Synchronization is the process of controlling access to shared resources in a multi-threaded environment. In the context
of collections, synchronization ensures that multiple threads can safely access and modify collections without causing
data corruption or inconsistency. Synchronized collection classes, such as Collections.synchronizedList(), provide
thread-safe access to underlying collections.

## What is the purpose of the java.util.Collections class?

The java.util.Collections class provides various utility methods for working with collections. It includes methods for
sorting, searching, shuffling, reversing, and synchronizing collections. It also provides methods to create unmodifiable
collections, singleton collections, and synchronized collections.

## How does the java.util.Collections class provide synchronization for collections?

The java.util.Collections class provides synchronized views of collections using the synchronizedXXX() methods. These
methods wrap the original collection and return a synchronized version of it, ensuring that all methods called on the
synchronized collection are thread-safe. This allows multiple threads to safely access and modify the underlying
collection.

## How would you sort a collection in Java?

There are multiple ways to sort a collection in Java:
For collections of objects that implement the Comparable interface, you can use the Collections.sort() method to perform
natural ordering.
For collections of objects that do not implement Comparable, you can provide a custom Comparator implementation and use
the Collections.sort() method with the custom Comparator.
If you are using Java 8 or above, you can use the stream() API and sorting methods such as sorted() and sorted(
Comparator).

## How does the LinkedHashMap differ from HashMap?

LinkedHashMap is an implementation of the Map interface that maintains the insertion order of elements. It is
implemented as a hash table with a doubly-linked list running through it, allowing predictable iteration order. HashMap,
on the other hand, does not guarantee any specific order of the elements.

## What is the difference between Iterator and ListIterator?

The Iterator interface is used to iterate over a collection in a forward direction. It provides methods like next(),
hasNext(), and remove(). ListIterator is a sub-interface of Iterator and provides additional methods, such as
previous(), hasPrevious(), add(), and set(), which allow bidirectional traversal and modification of elements in a List.

- Reference:- Let us Java by Yashavant Kanetkar
# Tell the uses of _this_ keyword in JAVA.

In Java, ‘this’ is a reference variable that refers to the current object or current object instance.

The basic usage of ___this___ keyword in java are:

__1)__ It can be used to call current class methods and fields.

__2)__ To pass an instance of the current class as a parameter.

__3)__ To differentiate between the local and instance variables.

Using “this” reference can improve code readability and reduce naming conflicts.

### Java this reference Example 
In Java, this is a reference variable that refers to the current object on which the method or constructor is being invoked. It can be used to access instance variables and methods of the current object.

#### Below is the implementation of this reference:

// Java Program to implement

// Java this reference

public class ThisExample {

	int num = 10;

	public ThisExample()
	{
		System.out.println("Inside constructor");
	}

	public ThisExample(int num)
	{
		// Invoking default constructor
		this();

		// Assigning the local variable num to the instance
		// variable num
		this.num = num;
	}

	void display()
	{
		// Invoking the method show() of the current class
		this.show();

		// Displaying the value of the instance variable num
		System.out.println("num: " + this.num);
	}

	void show()
	{
		System.out.println("Inside show method");
	}

	public static void main(String[] args)
	{
		ThisExample obj = new ThisExample(100);
		obj.display();
	}
}

#### output

Inside constructor

Inside show method

num: 100

### Advantages of using ‘this’ reference

There are certain advantages of using ‘this’ reference in Java as mentioned below:


* 1 It helps to distinguish between instance variables and local variables with the same name.
* 2 It can be used to pass the current object as an argument to another method.
* 3 It can be used to return the current object from a method.
* 4 It can be used to invoke a constructor from another overloaded constructor in the same class.

  
### Disadvantages of using ‘this’ reference

Although ‘this’ reference comes with many advantages there are certain disadvantages of also:

* 1 Overuse of this can make the code harder to read and understand.
* 2 Using this unnecessarily can add unnecessary overhead to the program.
* 3 Using this in a static context results in a compile-time error.

  
Overall, this keyword is a useful tool for working with objects in Java, but it should be used judiciously and only when necessary.

# Can we overload the constructors?

Yes, the constructors can be overloaded by changing the number of arguments accepted by the constructor or by changing
the data type of the parameters.

- let us try to understand this ung a simple java example

```java
public class Rectangle {
    private int width;
    private int height;

    // Default constructor
    public Rectangle() {
        width = 0;
        height = 0;
    }

    // Constructor with width and height parameters
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Constructor with only width parameter (assumes square)
    public Rectangle(int width) {
        this.width = width;
        this.height = width;
    }

    // Getter and setter methods
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Calculate and return the area of the rectangle
    public int calculateArea() {
        return width * height;
    }
}

```

**Above Example class `rectangle` has three constructors**
1. The default constructor initializes both the width and height variables to 0.
2. The second constructor takes two parameters, width and height, and assigns them to the respective instance variables.
3. The third constructor takes only the width parameter and assumes that the rectangle is a square, so it assigns the same value to both width and height.

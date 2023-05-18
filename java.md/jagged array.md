# what is jagged Array in java ?

In Java, a jagged array is a multidimensional array in which each row can have a different number of columns.
This is in contrast to a regular multidimensional array, where each row has the same number of columns.
A jagged array permits unequal number of elements in each row of a 2D array.

- let us now contract a 2D jagged array containing 3 rows. The number of elements in each of these three rows is 4, 3
  and 2 respectively.

```java
public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[4];
        arr[1] = new int[3];
        arr[2] = new int[2];

        arr[0][0] = 7;
        arr[0][1] = 2;
        arr[0][2] = 6;
        arr[0][3] = 1;
        arr[1][0] = 9;
        arr[1][1] = 3;
        arr[1][2] = 4;
        arr[2][0] = 1;
        arr[2][1] = 8;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
```

**output**

```
7,2,6,1
9,3,4
1,8
```

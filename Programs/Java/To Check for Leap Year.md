import java.util.Scanner; 
public class EvenOdd{
    public static void main(String args[]){
        System.out.println("Enter the year");
        Scanner s=new Scanner(System.in);
        int y=s.nextInt();
        if(y%4==0 && y%100!==0 ||y%400==0)
        System.out.println("Leap year");
        else
        System.out.println("Not Leap Year");
    }}

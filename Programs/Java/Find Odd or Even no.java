import java.util.Scanner; 
public class EvenOdd{
    public static void main(String args[]){
        System.out.println("Enter the no.");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a%2==0)
        System.out.println("Number is Even");
        else
        System.out.println("Number is odd");
    }
}

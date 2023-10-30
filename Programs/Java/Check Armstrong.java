import java.util.Scanner;
import java.lang.Math;
public class Main {
    
    public static void main(String[] args) {
        
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int count=0,r,temp;
      temp=n;
      double arm=0,z;
 
      while(temp!=0){
           temp=temp/10;
        count++;
      }
    temp=n;
    while(n>0){
    r=n%10;
    z=Math.pow(r,count);
        arm+=z;
        n=n/10;
    }
    
if(temp==arm)
System.out.println("true");
else 
System.out.println("false");
}
}

public class Solution {
    public static boolean palindromeNumber(int n){
     int x=n;
   int r,sum=0;
   while(n>0){
   r=n%10;
   n=n/10;
   sum=sum*10+r;
}
if(sum==x)
return true;
else return false;
    }
}

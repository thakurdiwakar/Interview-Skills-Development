class Solution
{
    public long reverse_digit(long n)
    {
        long r,rev=0;
       while(n!=0){
         r=n%10;
         n=n/10;
         rev=rev*10+r;
       } 
       return rev;
    }
}

import java.lang.Math;
public class Solution {
    static int countDigit(long x) {
        int ans =((int)Math.log10(x))+1;
       return ans;
    }
}

import java.io.*;
import java.util.*;

public class Solution {
    
    static int gcd(int a, int b)
{
      if(b == 0)
      {
        return a;
      }
      return gcd(b, a % b);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int result = obj.gcd(n1,n2);
        System.out.println(result);
        
        
    }
}

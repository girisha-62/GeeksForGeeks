//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.countOfNumbers(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int countOfNumbers(int N){
        // code here
        int c=0;
        for (int i = N - 97; i <= N; i++)
        {
            int a = sum(i);
            int b = sum(a);
            if ((i + a + b) == N)
            {
                c += 1;
            }
        }
        return c;
        
    }
    static int sum(int n)
    {
        int rem = 0;
        int sum_of_digits = 0;
            while (n > 0)
            {
            rem = n % 10;
            sum_of_digits += rem;
            n = n / 10;
            }
        return sum_of_digits;
    }
}
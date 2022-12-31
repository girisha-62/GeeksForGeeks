//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.factorProduct(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static final long M = 1000000007;
 
    // Iterative Function to calculate
    // (x^y) in O(log y)
    static long power(long x, long y)
    {
        long res = 1;
 
        while (y > 0)
        {
            if (y % 2 == 1)
                res = (res * x) % M;
            y = (y >> 1) % M;
            x = (x * x) % M;
        }
        return res;
    }
 
    // function to count the factors
    static int countFactors(int n)
    {
        int count = 0;
        for (int i = 1; i * i <= n; i++)
        {
            if (n % i == 0)
            {
 
                // If factors are equal,
                // count only once
                if (n / i == i)
                    count++;
 
                // Otherwise count both
                else
                    count += 2;
            }
        }
        return count;
    }
 
    static long factorProduct(int n)
    {
        int numFactor = countFactors(n);
 
        // Calculate product of factors
        long product = power(n, numFactor / 2);
 
        // If numFactor is odd return
        // power(n, numFactor/2) * sqrt(n)
        if (numFactor % 2 == 1)
            product = (product * (int)Math.sqrt(n)) % M;
 
        return product;
    }
}
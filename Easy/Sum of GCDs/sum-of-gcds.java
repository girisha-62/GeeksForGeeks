//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {   
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.sumOfGCDofPairs(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long sumOfGCDofPairs(int N){
        //complete the function here
        long count = 0;
        
        for(int i=1; i*i<=N; i++)
        {
            if(N%i==0)
            {
                int d1 = i;
                int d2 = N/i;
                
                count += d1*getCount(d1, N);
                count %= 1000000007;
                
                if(d1!=d2)
                {
                    count += d2*getCount(d2, N);
                    count %= 1000000007;
                }
            }
            
        }
        
        return count;
    }
    private static long getCount(int d, int n)
    {
        int no = n / d;
        
        int res = no;
        
        for(int p=2; p*p<=n; p++)
        {
            if(no%p==0)
            {
                while(no%p==0)
                {
                    no = no/p;
                }
                
                res -= res/p;
            }
            
        }
        
        if(no>1)
        {
            res = res - res/no;
        }
        
        return res;
    }
}
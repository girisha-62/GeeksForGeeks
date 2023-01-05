//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isAdjacentSetBits(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String isAdjacentSetBits(long n) {
        // code here
        long temp=0,rem;
        while(n!=0)
       {
            rem=n%2;
           if(temp==1&&rem==1)
           {
           return "Yes";
           }
           else 
           temp=rem;
           n/=2;
       }
       return "No";
    }
}
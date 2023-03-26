//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.lenOfLongIncSubArr(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public long lenOfLongIncSubArr(long arr[], long n)
    {
       if(n==1){
           return 1;
       }
       long count=0;
       long x=0;
       for(int i=0;i<n-1;i++){
           if(arr[i+1]>arr[i]){
               count++;
           }
           else{
               count=0;
              
           }
            x=Math.max(count,x);
       }
       return x+1;
    }
}
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
            System.out.println(obj.shortestUnorderedSubarray(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public long shortestUnorderedSubarray(long arr[], long n)
    {
       if(n < 3){
            return 0;
        }
        
        int flag = (arr[0] < arr[1]) ? 1 : 0;
        
        if(flag == 1){
            for(long i=2; i<n; i++){
                if(arr[(int)i] < arr[(int)i-1]){
                    return 3;
                }
            }
        }
        else{
            for(long i=2; i<n; i++){
                if(arr[(int)i] > arr[(int)i-1]){
                    return 3;
                }
            }
        }
        
        return 0; 
    }
}
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.MaxNumber(a, n));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public String MaxNumber(long arr[], long n)
    {
        //code here.
        StringBuilder ans = new StringBuilder();
        int[] fArr = new int[10];
        for (long i : arr) {
            fArr[(int) i]++;
        }
        for (int i = 9; i >= 0; i--) {
            int numberOfElements = fArr[i];
            if (numberOfElements > 0) {
                for (int j = 0; j < numberOfElements; j++) {
                    ans.append(i);
                }
            }
        }
        return ans.toString();
    }
}
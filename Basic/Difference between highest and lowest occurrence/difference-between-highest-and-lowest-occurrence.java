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
            System.out.println(obj.findDiff(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public long findDiff(long arr[], long n)
    {
        HashMap<Long,Integer>map=new HashMap<>();
        for(long ele:arr){
            if(map.containsKey(ele)) map.put(ele,map.get(ele)+1);

            else map.put(ele,1);

        }

        long max=0,min=map.get(arr[0]);

        

        for(long ele:arr){

            if(max < map.get(ele))max=map.get(ele);

            if(min > map.get(ele))min=map.get(ele);

        }
        return max-min;
    }
}
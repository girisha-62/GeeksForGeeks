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
            ob.sortIt(a, n);
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
            output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public void sortIt(long arr[], long n)
    {
        //code here.
        ArrayList<Long> ao=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]%2!=0){
                ao.add(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                ao.add(arr[i]);
            }
        }
        for(int i=0;i<ao.size();i++){
            arr[i]=ao.get(i);
        }
    }
}
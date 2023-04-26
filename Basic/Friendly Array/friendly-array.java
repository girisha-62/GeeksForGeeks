//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java



class Solution
{
    long sumOfMinAbsDifferences(long arr[] ,int N)
    {
        long ans = 0;
       
       Arrays.sort(arr);
       
       ans = arr[1] - arr[0];

       for(int i=1; i<N-1; i++){
           long left = arr[i] - arr[i-1];
           long right = arr[i+1] - arr[i];
           long min = (left < right) ? left : right;
           ans += min;
       }
       
       ans += arr[N-1] - arr[N-2];
       return ans;

       
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
            int n=Integer.parseInt(br.readLine());
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[]=new long[n];
            for(int  i=0;i<n;i++)
            {
                a[i]=Long.parseLong(a1[i]);
            }
            Solution ob=new Solution();
            long ans=ob.sumOfMinAbsDifferences(a,n);
            System.out.println(ans);
        }
    }
}




// } Driver Code Ends
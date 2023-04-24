//{ Driver Code Starts
//Initial Template for Java



//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java



class Solution 
{
    int checkFib(long arr[] ,int N)
    {
        long a=0;
        long b=1;
        long c=a+b;
        HashSet<Long> hs = new HashSet<>();
        hs.add(a);
        hs.add(b);
        int count=0;
        long max=Long.MIN_VALUE;
        for(long ar:arr)
        {
            if(ar>max)
            max=ar;
        }
        while(c<=max)
        {
            hs.add(c);
            a=b;b=c;
            c=a+b;
        }
        for(long ar : arr)
        {
            if(hs.contains(ar))
                count++;
        }
        return count;        
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
//            String line = br.readLine();
//            String[] a2 = line.trim().split("\\s+");
//            int n =Integer.parseInt(a2[0]);
//            int k =Integer.parseInt(a2[1]);
            //int y =Integer.parseInt(a2[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[]=new long[n];
            for(int i=0;i<n;i++)
            {
                a[i]=Long.parseLong(a1[i]);
            }
            Solution ob=new Solution ();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            int ans=ob.checkFib(a,n);
            System.out.println(ans);
        }
    }
}




// } Driver Code Ends
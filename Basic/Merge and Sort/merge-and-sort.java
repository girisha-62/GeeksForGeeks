//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

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
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n+5];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            int m = Integer.parseInt(br.readLine().trim());
            int b[] = new int[m+5];
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            int answer[] = new int[n+m+5];
            
            Solution obj = new Solution();
            int k=obj.mergeNsort(a, b, n, m, answer);
            StringBuilder output = new StringBuilder();
            for(int i=0;i<k;i++)
            output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {

    public static int mergeNsort(int a[], int b[], int n, int m, int answer[])
    {
        // Write your code here
         HashMap <Integer,Integer> mp = new HashMap<>();

        

        for(int i=0;i<n;i++){

            if(mp.containsKey(a[i])){

                mp.put(a[i],mp.get(a[i])+1);

            }else{

                mp.put(a[i],1);

            }

        }

        for(int i=0;i<m;i++){

            if(mp.containsKey(b[i])){

                mp.put(b[i],mp.get(b[i])+1);

            }else{

                mp.put(b[i],1);

            }

        }

        

        int k=0;

        for(int i:mp.keySet()){

            answer[k++] = i;

        }

        return k;
    }
}


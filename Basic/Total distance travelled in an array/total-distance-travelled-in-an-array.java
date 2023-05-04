//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            long ans = new Solution().distance(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    long distance(int[] arr, int n) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
       for(int i=0; i<n; i++){
           map.put(arr[i],i);
       }
       long sum=0;
       for(int i=1; i<n; i++){
           if(map.get(i)<map.get(i+1)){
               sum+=(long)(map.get(i+1)-map.get(i));
           }else{
               sum+=(long)(map.get(i)-map.get(i+1));
           }
       }
       return sum;
    }
}

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.minimumLuckyNumber(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String minimumLuckyNumber(int N) {
        // code here
        int c=0;
        String s="";
        while(N>0){
            if(N%7==0){
                s+="7";
                N=N-7;
                c=1;
            }
            else{
                s+="4";
                N=N-4;
            }
            if(N==0){
                return s;
            }
        }
        return "-1";
    }
}
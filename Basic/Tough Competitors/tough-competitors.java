//{ Driver Code Starts


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

            int ans = new Solution().toughCompetitor(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends





class Solution {
    int toughCompetitor(int[] arr, int n) {
        // code here
         Arrays.sort(arr);

        int res=arr[1]-arr[0];

        for(int i=1;i<n-1;i++){

            int dif=arr[i+1]-arr[i];

            if(dif<res)

            res=dif;

        }

        return res;
    }
}

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

            int ans = new Solution().getOddOccurrence(arr, n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    int getOddOccurrence(int[] arr, int n) {
        // code here
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int i = 0; i< n; i++)

        {

            int temp = map.getOrDefault(arr[i],0);

            map.put(arr[i], temp+1);

        }

        for(int i = 0 ;i < n; i++)

        {

            if(map.get(arr[i]) % 2 != 0)

            {

                return arr[i];

            }

        }

        return -1;
    }
}

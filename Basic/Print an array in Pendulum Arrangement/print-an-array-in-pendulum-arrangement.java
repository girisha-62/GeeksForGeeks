//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Compute obj = new Compute();
            int answer[] = obj.pendulumArrangement(arr, n);
            int sz = answer.length;

            StringBuilder output = new StringBuilder();
            for (int i = 0; i < sz; i++) output.append(answer[i] + " ");
            System.out.println(output);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Compute {
    public int[] pendulumArrangement(int arr[], int n) {
        // Write your code here
        Arrays.sort(arr);
        int[] a=new int[n];
        
         int mid=(n-1)/2;
         a[mid]=arr[0];
          int j=1;
          int l=mid-1;
          int r=mid+1;
         while(j<n){
             if(r<n){
            a[r]=arr[j];
              r++;
              j++;
             }
              if(l>=0){
                  
              a[l]=arr[j];
               l--;
              j++;
              }
         }
        return a;
    }
}
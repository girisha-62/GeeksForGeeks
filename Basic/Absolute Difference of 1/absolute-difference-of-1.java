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
            long k = Long.parseLong(inputLine[1]);
            long[] arr = new long[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            long[] ans = new Solution().getDigitDiff1AndLessK(arr, n, k);
            for (long ele : ans) {
                System.out.print(ele + " ");
            }
            if (ans.length == 0) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java





class Solution {
    long[] getDigitDiff1AndLessK(long[] arr, int n, long k) {
        // code here
        ArrayList<Long> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<k){
                if(isDiff(arr[i])){
                    a.add(arr[i]);
                }
            }
        }
        long[] ans=new long[a.size()];
        int counter=0;
        for(long y: a){
            ans[counter++]=y;
        }
        return ans;
    }
    static boolean isDiff(long num){
            if(num/10==0){
                return false;
            }
            long f=num%10;
            num=num/10;
            long s=num%10;
            while(num>0){
                if(Math.abs(f-s)!=1){
                    return false;
                }
                f=s;
                num=num/10;
                s=num%10;
            }
            return true;
        }
}

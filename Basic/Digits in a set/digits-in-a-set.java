//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            long ans = new Solution().countNumbers(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int countNumbers(int n) {
        // code here
         ArrayList<Integer> al = new ArrayList<>();
        int count=0;
        Collections.addAll(al,1,2,3,4,5);
        while(n != 0){
            count += check(n,al);
            n--;
        }
        return count;
    }
    int check(int n,ArrayList<Integer> al){
        boolean flag =false;
        while(n != 0){
            if(al.contains(n%10)){
                flag = true;
            }
            else{
                return 0;
            }
            n /= 10;
        }
        return (flag==true)?1:0;
    }
}

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.Express(N);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int a=0,b=0;
    public static int[]  Express(int N)
    {
        // code here
        int[] ans=new int[4];
        if(N<=7){
            ans=new int[1];
            ans[0]=-1;
        }
         else if(N%2!=0){
            num(N-5);
            ans[0]=2;
            ans[1]=3;
            ans[2]=a;
            ans[3]=b;
        }
        else{
            num(N-4);
            ans[0]=2;
            ans[1]=2;
            ans[2]=a;
            ans[3]=b;
        }
        Arrays.sort(ans);
        return ans;
        
    }
    public static int isprime(int n){
        if(n<=1){
            return 0;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void num(int n){
        for(int i=0;i<=n/2;i++){
            if(isprime(i)!=0 && isprime(n-i)!=0){
                a=i;
                b=n-i;
                return;
            }
        }
    }
}
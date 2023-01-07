//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    long N=sc.nextLong();
                    long M=sc.nextLong();
                    Solution obj = new Solution();
                    System.out.println(obj.longestCommon(M,N));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String IntToBinary(long m)
   {
       String ans="";
       long k=1;
       while(m>0)
       {
           long rem=m%2;
           ans=(char)(rem+'0')+ans;
           m/=2;
       }
       return ans;
   }
   public long longestCommon(long M, long N)
   {
       String s1=IntToBinary(M);
       String s2=IntToBinary(N);
        ArrayList<Integer>temp=new ArrayList<Integer>();
       long dp[][]=new long[s1.length()+1][s2.length()+1],ans=0;
       for(int i=0;i<=s1.length();i++)
       {
           for(int j=0;j<=s2.length();j++)
           {
               if(i==0||j==0)
               {
                   dp[i][j]=0;
               }
               else
               {
                   if(s1.charAt(i-1)==s2.charAt(j-1))
                   dp[i][j]=1+dp[i-1][j-1];
                   else
                   dp[i][j]=0;
               }
               if(dp[i][j]>ans)
               {
                   ans=dp[i][j];
                   
               }
              
               
           }
       }
        for(int i=0;i<=s1.length();i++)
       {
           for(int j=0;j<=s2.length();j++)
           {
               if(dp[i][j]==ans)
               {
                   temp.add(i-1);
               }
           }
           
       }
       long fin=0;
       for(int t=0;t<temp.size();t++)
       {
       String res="";
       long index=temp.get(t);
       res=s1.substring((int)(index-ans+1),(int)index+1);
       long x=Integer.parseInt(res,2);
       fin=Math.max(fin,x);
       }
       return fin;
   }
}
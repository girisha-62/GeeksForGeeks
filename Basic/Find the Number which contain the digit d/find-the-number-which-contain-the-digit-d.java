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
                    int n=sc.nextInt();
                    int d=sc.nextInt();
                    Solution obj = new Solution();
                    
                    Vector<Integer> v= obj.solve(n,d);
                    
                    for (int i = 0; i < v.size(); i++) 
                        System.out.print(v.get(i) + " ");
                        
                    System.out.println();
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public Vector<Integer> solve(int n, int d)
    {
        //code here
        Vector<Integer> ans = new Vector<>();
      for(int i=0;i<=n;i++)
      {
          boolean num = digit(i,d);
          if(num)
          {
              ans.add(i);
          }
      }
      if(ans.size()==0)
      {
          ans.add(-1);
      }
      return ans;
    }
    static boolean digit(int x,int d)
   {
       if(x==0 && d==0)
       {
           return true;
       }
       while(x!=0)
       {
         if(x%10==d)
         {
             return true;
         }
         x/=10;
       }
       return false;
   }
}
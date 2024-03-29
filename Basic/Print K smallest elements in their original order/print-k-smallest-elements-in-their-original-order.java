//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends

//User function Template for Java


class Solution{
    
  
    ArrayList<Integer> kSmallestElements(int arr[], int n, int k)
    {
        // Complete the function
        ArrayList<Integer> a=new ArrayList<>();
       int max=Integer.MIN_VALUE;
       int m_i=-1;
       for(int i=0;i<n;i++)
       {
           max=Integer.MIN_VALUE;
           m_i=-1;
           if(i<k)
           {
               a.add(arr[i]);
           }
           else{
               for(int j=0;j<a.size();j++)
               {
                   if(a.get(j)>=max)
                   {
                       max=a.get(j);
                       m_i=j;
                   }
               }
               if(arr[i]<max)
               {
                   a.remove(m_i);
                   a.add(arr[i]);
               }
           }
       }
       return a;
    }
  
    
}


//{ Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    String line1 = br.readLine();
		    String[] element = line1.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		    res = obj.kSmallestElements(arr, sizeOfArray, K);
		    for(int i:res)
		        System.out.print(i + " ");
		    System.out.println();
		    
		    
		}
	}
}


            

// } Driver Code Ends
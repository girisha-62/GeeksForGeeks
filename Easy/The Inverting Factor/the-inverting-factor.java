//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		     
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    Complete obj = new Complete();
		    int ans = obj.findMinimumInvertingFactor(arr, sizeOfArray);
		    System.out.println(ans);
		}
	}
}




// } Driver Code Ends


//User function Template for Java


class Complete{
    
   
    // Function for finding maximum and value pair
    public static int findMinimumInvertingFactor (int arr[], int n) {
        //Complete the function
        for(int i=0;i<n;i++){
       int p=arr[i],x,y=0;
       while(p!=0)          // for reversing the each number in array.
       {
        x=p%10;          
        y=(y*10)+x;       // y will be the reversed number.
        p=p/10;          
       }
       arr[i]=y;                      
       }
  
       Arrays.sort(arr);
       int ans = Integer.MAX_VALUE;
       for (int i = 1; i < n; i++)
           ans = Math.min(ans, Math.abs(arr[i] - arr[i - 1]));

       return ans;
    }
    
    
}



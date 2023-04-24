//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    
		    int n = Integer.parseInt(br.readLine());
		    int arr[] = new int[n];
		    
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split(" ");
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Solution obj = new Solution();
		    
		    if(obj.checkUnimodal(arr,n))
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		        
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    
    static boolean checkUnimodal(int arr[], int n) 
    { 
        // Complete the function
        int operator = 1;
        for(int i=0;i<n-1;i++){
            switch(operator){
                case 1 : 
                   if(arr[i] == arr[i+1]){
                        operator = 0;
                    }
                    else if(arr[i] > arr[i+1]){
                        operator = -1;
                    }
                    break;
                case 0:
                    if(arr[i] < arr[i+1]){
                        return false;
                    }
                    else if(arr[i] > arr[i+1]){
                        operator = -1;
                    }
                    break;
                case -1 : 
                   if(arr[i] <= arr[i+1]){
                        return false;
                    }
                    break;
            }
        }
        
        return true;
        }
    } 



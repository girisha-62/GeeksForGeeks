//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());// input size of array
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
		}
	}
}



// } Driver Code Ends


class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int a[], int n) {
        
        // Your code here
        return Integer.max(kadane(a,n), reverseKadane(a,n));
    }
    
    public static int kadane(int a[], int n){
        if(n==1){
            return a[0];
        }
        int maxSum = a[0];
        int currSum = maxSum;
        
        for(int i=1;i<n;i++){
            currSum = currSum + a[i];
            if(currSum<a[i]){
                currSum = a[i];
            }
            if(currSum>maxSum){
                maxSum=currSum;
            }
        }
        return maxSum;
    }
    
    public static int reverseKadane(int a[], int n){
        if(n==1){
            return a[0];
        }
        int minSum = a[0];
        int currSum = minSum;
        int sum = a[0];
        for(int i=1;i<n;i++){
            sum=sum+a[i];
            currSum = currSum + a[i];
            if(currSum>a[i]){
                currSum = a[i];
            }
            if(currSum<minSum){
                minSum=currSum;
            }
        }
        if(sum != minSum){
          return sum-minSum;
        }else{
            return Integer.MIN_VALUE;
        }
    }
    
}


//{ Driver Code Starts
import java.util.*;
import java.lang.Math;


class Largest_Product_Subarray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			int arr[]  = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
				
			
			
			GfG g = new GfG();
			System.out.println(g.findMaxProduct(arr, n , k));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete the function*/
class GfG
{
    long findMaxProduct(int A[], int n, int k)
    {
	// Your code here
	long maxProd = -1;

        for(int i=0;i<=n-k;i++)

        {

            long prod=1;

            for(int j=i;j<i+k;j++)

            {

                prod = prod*A[j];

            }

            maxProd = Math.max(maxProd, prod);

        }

        return maxProd;


    }
}
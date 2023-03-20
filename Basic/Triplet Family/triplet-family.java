//{ Driver Code Starts
import java.util.*;

class Triplet
{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
              arr[i] = sc.nextInt();
              
            GfG gfg = new GfG();
           ArrayList<Integer> res = new ArrayList<Integer>();
           res = gfg.findTriplet(arr, n);
            if(res.size()!=3)System.out.println("-1");
	    else
	    {
	        Collections.sort(res);
	        if(res.get(0)+res.get(1) == res.get(2))
	            System.out.println("1");
	        else
	             System.out.println("0");
	    }
           //System.out.println();
            
        }
    }
}

// } Driver Code Ends


class GfG
{
    public static ArrayList<Integer> findTriplet(int arr[], int n)
    {
        // your code here
         ArrayList<Integer> list = new ArrayList<>();
         Arrays.sort(arr);
         for(int i = n-1; i >= 2; i--){
            int low = 0, high = i-1;
            while(low < high){
                if(arr[low] + arr[high] == arr[i]){
                    list.add(arr[low]);
                    list.add(arr[high]);
                    list.add(arr[i]);
                    return list;
                }
                else if(arr[low] + arr[high] > arr[i])
                     high--;
                else low++;

            }

        }
        return list;
    }
}
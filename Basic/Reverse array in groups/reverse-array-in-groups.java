//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        
        //while testcases exist
        while(t-->0){
            
            String inputLine1[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine1[0]);
            int k = Integer.parseInt(inputLine1[1]);
            
            ArrayList<Integer> arr = new ArrayList<>();            
            String inputLine2[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr.add(Integer.parseInt(inputLine2[i]));
            }
            
            Solution obj = new Solution();
            obj.reverseInGroups(arr, n, k);
            
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr.get(i) + " ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        if(k > arr.size())

        {

            Collections.reverse(arr);

            return;

        }

        float a = n, b = k;

        int numberofgroups = (int) Math.ceil(a/b);

        ArrayList<Integer> ar = new ArrayList<>();

        while(numberofgroups > 0)

        {

            ArrayList<Integer> al = new ArrayList<>();

            for(int i = 0; (i < k && i < arr.size()); i++)

            {

                al.add(arr.get(i));

            }

            if(arr.size() > k)

            arr.subList(0, k).clear();

            else

            arr.subList(0, arr.size()).clear();

            Collections.reverse(al);

            ar.addAll(al);

            numberofgroups--;

        }

        arr.addAll(ar);
    }
}

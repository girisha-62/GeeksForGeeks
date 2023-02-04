//{ Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG {
    int convertfive(int num) {
        // Your code here
        if(num==0){
            return 5;
        }        
        int localnum = num;
        int i=1;
        while(localnum > 0){
            int digit = localnum %10;
            if (digit == 0){
              num = num + (5*i);
            }
            localnum /=10;
            i*=10;
        }
        return num;
    }
}
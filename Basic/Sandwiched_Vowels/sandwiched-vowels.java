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
		    
		    String s = br.readLine().trim();
		  
		    Complete obj = new Complete();
		    
		    System.out.println(obj.Sandwiched_Vowel(s));
		        
		}
		
	}
}



// } Driver Code Ends


//User function Template for Java

class Complete{
    
   
    public static String Sandwiched_Vowel(String str) 
    { 
        // Complete function
         StringBuilder sb = new StringBuilder();
       for(int i=0;i<str.length();i++){
           if(!isVowel(str.charAt(i))){
               sb.append(str.charAt(i));
           }else if((i>0)&&(i<str.length()-1)&&(!isVowel(str.charAt(i-1)))&&(!isVowel(str.charAt(i+1)))){
               continue;
           }else{
               sb.append(str.charAt(i));
           }
       }
       return sb.toString();
   } 
   static boolean isVowel(char c){
       if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
           return true;
       }
       return false;
    } 
}

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      List<List<String>> accounts=new ArrayList<>();
      for (int i = 0; i < n; i++)
       {
        ArrayList<String> temp=new ArrayList<>();
        int x=sc.nextInt();
        for(int j = 0; j < x; j++)
           {
             String s1=sc.next();
             temp.add(s1);
           }
        accounts.add(temp);
       }
      Solution obj = new Solution();
      List<List<String>> res = obj.accountsMerge(accounts);
      Collections.sort(res, new Comparator<List<String>>() {
                @Override   public int compare(List<String> a,
                                              List<String> b) {
                    int al = a.size();
                    int bl = b.size();
                    int min = Math.min(al, bl);
                    for (int i = 0; i < min; i++) {
                        String xx=a.get(i);
                        String yy=b.get(i);
                        if (xx.compareTo(yy)<0)
                            return -1;
                        else if (xx.compareTo(yy)>0)
                            return 1;
                    }
                    if (al < bl)
                        return -1;
                    else if (al > bl)
                        return 1;
                    return -1;
                }
            });
      System.out.print("[");
      for (int i = 0; i < res.size(); ++i)
        {
          System.out.print("[");
          for (int j = 0; j < res.get(i).size(); j++)
             {
                if (j != res.get(i).size() - 1)
                     System.out.print(res.get(i).get(j)+", ");
                else
                     System.out.print(res.get(i).get(j));
             }
          if (i != res.size() - 1)
             System.out.println("], ");
          else
             System.out.print("]");
        }
       System.out.println("]");
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Disjoint{

    

    

    ArrayList<Integer> size=new ArrayList<>();

    ArrayList<Integer> parents=new ArrayList<>();

    

    Disjoint(int n){

    for(int i=0;i<=n;i++){

        size.add(1);

        parents.add(i);

    }

    }

    

    

    int findUp(int node){

        if(node==parents.get(node)){

            return node;

        }

        

        int up=findUp(parents.get(node));

        parents.set(node,up);

        return parents.get(node);

    }

    

    

    void UniSize(int u, int v){

        int up=findUp(u);

        int vp=findUp(v);

        if(up==vp) return;

        if(size.get(up)>size.get(vp)){

            parents.set(vp,up);

            size.set(up,size.get(up)+size.get(vp));

        }

        else{

            parents.set(up,vp);

          size.set(vp,size.get(up)+size.get(vp));

 

        }

    }

}

 

class Solution {

  static List<List<String>> accountsMerge(List<List<String>> accounts) {

    // code here

    

    int n=accounts.size();

    Disjoint ds=new Disjoint(n);

    

    HashMap<String,Integer> map=new HashMap<>();

    for(int i=0;i<n;i++){

        for(int j=1;j<accounts.get(i).size();j++){

            String mail=accounts.get(i).get(j);

            if(map.containsKey(mail)==false){

                map.put(mail,i);

            }

            else{

                ds.UniSize(i,map.get(mail));

            }

        }

    }

    

    

    ArrayList<String>[] merge=new ArrayList[n];

    

    for(int i=0;i<n;i++){

        merge[i]=new ArrayList<String>();

    }

    

    for(Map.Entry<String,Integer> it: map.entrySet()){

        String mail=it.getKey();

        int node=ds.findUp(it.getValue());

        merge[node].add(mail);

    }

    

    List<List<String>> ans=new ArrayList<>();

    

    for(int i=0;i<n;i++){

        if(merge[i].size()==0) continue;

        Collections.sort(merge[i]);

        List<String> temp=new ArrayList<>();

        temp.add(accounts.get(i).get(0));

        for(String it : merge[i]){

            temp.add(it);

        }

        ans.add(temp);

    }

    

    

    return ans;

    

    

 

  }

}
     
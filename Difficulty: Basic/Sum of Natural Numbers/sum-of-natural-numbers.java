//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int res = obj.seriesSum(n);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int seriesSum(int n) {
        // code here
        int sum =0;
        return sum(sum,n);
    }
    public static int sum(int s,int n){
        if(n==0){
            return s;
        }
        s=s+n;
        n=n-1;
        return sum(s,n);
    }
}

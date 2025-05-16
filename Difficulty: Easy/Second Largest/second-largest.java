//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        int a = Integer.MIN_VALUE;
        for(int i:arr){
            a=Math.max(a,i);
            max=Math.max(max,a);
        }
        a = Integer.MIN_VALUE;
        for(int i:arr){
            if(i!=max){
                a=Math.max(a,i);
                secmax=Math.max(a,secmax);
            }
            else {
            }
        }
        if(secmax==Integer.MIN_VALUE) secmax=-1;
        return secmax;
    }
}
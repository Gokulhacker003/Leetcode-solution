// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
       long n =arr.length;
        long SN=(n*(n+1))/2;
        long S2N=(n*((n+1))*(2*n+1))/6;
        long S=0,S2=0;
        for (int j : arr) {
            S += j;
            S2 += ((long) j *(long)j);
        }
        long val1=S-SN;
        long val2=S2-S2N;
        val2=val2/val1;
        int x=(int)((val1+val2)/2);
        int y=(int)(x-val1);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(x);
        list.add(y);
        return list;
    }
}

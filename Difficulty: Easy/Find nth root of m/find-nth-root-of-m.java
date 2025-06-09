// User function Template for Java

class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int i=1;
        int j=m;
        while(i<=j){
            int mid=(i+j)/2;
            int pow=pow(mid,n);
            if(pow==m){
                return mid;
            }
            if(pow>m) j=mid-1;
            else i=mid+1;
        }
        return -1;
    }
    int pow(int n,int m){
        int k=1;
        for(int i=1;i<=m;i++){
            k*=n;
        }
        return k;
    }
}
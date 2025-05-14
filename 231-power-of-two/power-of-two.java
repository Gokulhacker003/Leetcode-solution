class Solution {
    static boolean isPowerOfTwo(int n) {
       if(n==1) return true;
        return isPowerOfTwo(n,1);
    }
    static boolean isPowerOfTwo(int pow,int n){
        if(Math.pow(2,n)==pow){
            return true;
        }
        if(Math.pow(2,n)>pow){
            return false;
        }
        return isPowerOfTwo(pow,n+1);
    }
}
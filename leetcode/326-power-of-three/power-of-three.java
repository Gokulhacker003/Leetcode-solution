class Solution {
    public boolean isPowerOfThree(int n){
        if(n==1) return true;
        return isPowerOfThree(n,1);
    }
    public boolean isPowerOfThree(int pow,int n) {
     if(Math.pow(3,n)==pow){
            return true;
        }
        if(Math.pow(3,n)>pow){
            return false;
        }
        return isPowerOfThree(pow,n+1);   
    }
}
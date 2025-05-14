class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        return isPowerOfFour(n,1);
    }
    
    public boolean isPowerOfFour(int pow,int n){
        if(Math.pow(4,n)==pow){
            return true;
        }
        if(Math.pow(4,n)>pow){
            return false;
        }
        return isPowerOfFour(pow,n+1);}
    
}
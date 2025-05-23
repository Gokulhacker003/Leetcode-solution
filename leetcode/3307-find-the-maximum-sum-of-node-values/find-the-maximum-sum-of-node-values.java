class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long drop=Long.MAX_VALUE;
        long gain=Long.MAX_VALUE;
        long total=0;
        long count=0;
        for(int i:nums){
            if((i^k)>i){
                total+=i^k;
                count++;
                gain=Math.min(gain,(i^k)-i);
            }
            else{
                total+=i;
                drop=Math.min(drop,i-(i^k));
            }
        }
        if(count%2==0){return total;}
        return total-Math.min(gain,drop);
        } 
}
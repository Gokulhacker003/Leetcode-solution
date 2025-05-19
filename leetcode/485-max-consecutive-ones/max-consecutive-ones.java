class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=Integer.MIN_VALUE;
        int a=Integer.MIN_VALUE;
        int count=0;
        for(int i:nums){
            if(i==1){
                count++;
            }
            else count=0;
            a=Math.max(a,count);
            max=Math.max(a,max);
        }
        return max;
    }
}
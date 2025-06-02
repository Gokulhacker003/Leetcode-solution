class Solution {
    public int maxProduct(int[] nums) {
        int preffix=1;
        int suffix=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(preffix==0){
                preffix=1;
            }
            preffix*=nums[i];
            max=Math.max(preffix,max);
        }
        for(int i=nums.length-1;i>=0;i--){
            if(suffix==0){
                suffix=1;
            }
            suffix*=nums[i];
            max=Math.max(suffix,max);
        }
        return max;
    }
}
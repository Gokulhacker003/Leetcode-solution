class Solution {
    int maxSubarraySum(int[] nums) {
        // Your code here
        int maxValue = nums[0];
        int curr  = 0;
        for(int i = 0; i < nums.length; i++ ){
            curr += nums[i];

            maxValue = (curr > maxValue) ? curr : maxValue;
            if(curr < 0){
                curr=0;
            }

        }
        return maxValue;
    }
}

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] reArr =new int[nums.length];
        int oddind=1;
        int evenind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                reArr[evenind]=nums[i];
                evenind=evenind+2;
            }
            else{
                reArr[oddind]=nums[i];
                oddind=oddind+2;
            }
        }
        return reArr;
    }
}
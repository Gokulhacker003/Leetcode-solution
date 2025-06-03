class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target){
                res[0]=mid;
                h=mid-1;
            }
            else if(nums[mid]>target) h=mid-1;
            else l=mid+1;      
        }
        l=0;
        h=nums.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target){
                res[1]=mid;
                l=mid+1;
            }
            else if(nums[mid]>target) h=mid-1;
            else l=mid+1;      
        }
        return res;
    }
}
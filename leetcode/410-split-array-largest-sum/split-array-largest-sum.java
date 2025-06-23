class Solution {
    public int splitArray(int[] nums, int k) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i:nums){
            low=Math.max(low,i);
            high+=i;
        }
        while(low<high)
        {int mid=(low+high)/2;
        if(canSplit(nums,k,mid)){
            high=mid;
        }
        else low=mid+1;
        }
    return low;
    }
    public boolean canSplit(int[] num,int k,int limits){
        int count=1;
        int current_sum=0;
        for(int i:num){
            if (current_sum+i>limits){
                count++;
                current_sum=i;
            }
            else current_sum+=i;
        }
        return count<=k;
    }
}
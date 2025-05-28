class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int sum =0;
        HashMap<Integer,Integer> num=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==k){
                count++;
            }
            int rem =sum-k;
            if(num.containsKey(rem)){
                count=count+num.get(rem);
            }
           num.put(sum,num.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
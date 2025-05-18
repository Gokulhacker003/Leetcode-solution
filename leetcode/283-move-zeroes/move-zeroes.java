class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> zero=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                zero.add(nums[i]);
            }
            nums[i]=0;
        }
        for(int i=0;i<zero.size();i++){
            nums[i]=zero.get(i);
        }
        
    }
}
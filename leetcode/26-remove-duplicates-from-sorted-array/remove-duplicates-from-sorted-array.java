class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> dup =new HashMap<>();
        for(int i:nums){
            dup.put(i,dup.getOrDefault(i,0)+1);
        }
        Integer[] num=dup.keySet().toArray(new Integer[0]);
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
            nums[i]=num[i];
        }
        return num.length;
    }
}
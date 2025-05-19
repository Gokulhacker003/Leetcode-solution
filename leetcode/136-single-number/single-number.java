class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> num=new HashMap<>();
        for(int i:nums){
            num.put(i,num.getOrDefault(i,0)+1);
        }
        for(int i:num.keySet()){
            if(num.get(i)==1){
                return i;
            }
        }
        return 0;
    }
}
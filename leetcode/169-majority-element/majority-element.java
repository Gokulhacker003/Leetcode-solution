class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> majority=new HashMap<>();
    int max =Integer.MIN_VALUE;
    for(int i:nums){
        majority.put(i,majority.getOrDefault(i,0)+1);
    }
    int n=0;
    for(int i :majority.keySet()){
        if(max<majority.get(i)){
            max=majority.get(i);
            n=i;
        }
        max=Math.max(max,majority.get(i));
    }
    return n;
    }
}
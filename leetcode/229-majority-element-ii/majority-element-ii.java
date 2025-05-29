class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> majority=new HashMap<>();
        List<Integer> element=new ArrayList<>();
        int n=nums.length;
        for(int i:nums){
            majority.put(i,majority.getOrDefault(i,0)+1);
        }
        for(int i:majority.keySet()){
            if(n/3<majority.get(i)){
                element.add(i);
            }
        }
        return element;
    }
}
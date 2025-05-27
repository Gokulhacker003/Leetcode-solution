class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> consecutivenum=new HashSet<>();
        int max=0;
        for(int i:nums){
            consecutivenum.add(i);
        }
        for(int element:consecutivenum){
            if(!consecutivenum.contains(element-1)){
                int count=1;
                int index=element;
                while(consecutivenum.contains(index+1)){
                    count++;
                    index++;
                }
                max=Math.max(count,max);
            }
        }
        return max;
    }
}
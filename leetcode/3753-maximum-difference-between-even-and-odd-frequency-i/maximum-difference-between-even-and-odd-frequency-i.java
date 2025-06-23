class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> frequency=new HashMap<>();
        for(char ch:s.toCharArray()){
            frequency.put(ch,frequency.getOrDefault(ch,0)+1);
        }
        int maxodd=Integer.MIN_VALUE;
        int minEven=Integer.MAX_VALUE;
        for(int i:frequency.values()){
            if(i%2==0){
                minEven=Math.min(i,minEven);
            }
            else maxodd=Math.max(i,maxodd);
        }
        return maxodd-minEven;
    }
}
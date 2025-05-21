// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> presum=new HashMap<>();
        int sum=0;
        int maxLen=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                maxLen=Math.max(maxLen,i+1);
            }
            int rem =sum-k;
            if(presum.containsKey(rem)){
                int len=i-presum.get(rem);
                maxLen=Math.max(len,maxLen);
            }
            if(!presum.containsKey(sum)){
                presum.put(sum,i);
            }
        }
        return maxLen;
    }
}
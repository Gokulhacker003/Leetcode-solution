class Solution {
    int maxLen(int arr[]) {
        // code here
        HashMap<Integer,Integer> presum=new HashMap<>();
        int sum=0;
        int maxLen=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maxLen=Math.max(maxLen,i+1);
            }
            if(presum.containsKey(sum)){
                int len=i-presum.get(sum);
                maxLen=Math.max(len,maxLen);
            }
            if(!presum.containsKey(sum)){
                presum.put(sum,i);
            }
        }
        return maxLen;
    }
}
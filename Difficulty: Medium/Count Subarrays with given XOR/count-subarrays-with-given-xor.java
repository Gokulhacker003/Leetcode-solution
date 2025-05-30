class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int count=0;
        int xor=0;
        HashMap<Integer,Integer> XOR=new HashMap<>();
        for(int i:arr){
            xor=xor^i;
            if(xor==k){
                count++;
            }
            int y =xor^k;
            if(XOR.containsKey(y)){
                count+=XOR.get(y);
            }
            XOR.put(xor,XOR.getOrDefault(xor,0)+1);
        }
        return count;
    }
}
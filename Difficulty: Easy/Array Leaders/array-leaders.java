class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> leaders=new ArrayList<>();
        int leader=arr[arr.length-1];
        leaders.add(leader);
        for(int i=arr.length-2;i>=0;i--){
            if(leader<=arr[i]){
                leaders.add(0,arr[i]);
                leader=arr[i];
                
            }
        }
        return leaders;
    }
}

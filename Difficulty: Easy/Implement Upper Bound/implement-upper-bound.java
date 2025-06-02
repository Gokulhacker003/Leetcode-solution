class Solution {
    int upperBound(int[] arr, int target) {
        // code here
         int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]<=target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
}

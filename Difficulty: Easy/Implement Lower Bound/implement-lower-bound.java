class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int start=0;
        int end =arr.length-1;
        int index=arr.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=target){
                index=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return index;
    }
}

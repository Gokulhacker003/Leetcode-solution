// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int maxCount=0;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            int count=arr[i].length-binarySearch(arr[i]);
            if(maxCount<count){
                maxCount=count;
                index=i;
            }
        }
        return index;
    }
    public int binarySearch(int[] row){
        int low=0,high=row.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(row[mid]==1){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }
}
class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int[] res =firstAndlastPostion(arr,target);
        if(res[0]==-1) return 0;
        return (res[1]-res[0]+1);
    }
    int firstOccurence(int[] arr,int target){
        int start=0;
        int end =arr.length-1;
        int first=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]==target){
                first=mid;
                end=mid-1;
                
            }
            else{
                end=mid-1;
            }
        }
        return first;
    }
    int lastOccurence(int[] arr,int target){
        int start=0;
        int end =arr.length-1;
        int last=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                last=mid;
                start=mid+1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return last;
    }
    int[] firstAndlastPostion(int[] arr,int target){
        int first=firstOccurence(arr,target);
        if(first==-1) return new int[]{-1,-1};
        int last = lastOccurence(arr,target);
        return new int[] {first,last};
    }
}

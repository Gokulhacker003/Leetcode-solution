class Solution {
    public int reversePairs(int[] nums) {
       return mergeSort(nums,0,nums.length-1); 
    }
    int mergeSort(int[] arr, int l, int r) {
        // code here
        int count=0;
        if(l==r){
            return 0;
        }
        int mid =(l+r)/2;
        count+=mergeSort(arr,l,mid);
        count+=mergeSort(arr,mid+1,r);
        count+=pairrevese(arr,l,mid,r);
        mergeSort(arr,l,mid,r);
        return count;
    }
    void mergeSort(int[] arr,int l,int mid,int r){
        ArrayList<Integer> temp=new ArrayList<>();
        int left =l;
        int right=mid+1;
        while(left<=mid&&right<=r){
            if(arr[left]<arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }while(left<=mid&&right-1==r){
                temp.add(arr[left]);
                left++;
            }
            while(right<=r&&left-1==mid) {
                temp.add(arr[right]);
                right++;
            }
        }

        for(int i=0;i<=r-l;i++){
            arr[i+l]= temp.get(i);
        }
    }
    int pairrevese(int[] arr,int low,int mid,int high){
        int count=0;
        int j=mid+1;
        for(int i=low;i<=mid;i++){
            while(j<=high&&arr[i]>2L*arr[j]) j++;
            count+=(j-(mid+1));
        }
        return count;
    }
}
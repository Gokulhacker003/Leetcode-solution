class Solution {
    public static int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int w:weights){
            low=Math.max(w,low);
            high+=w;
        }
        while (low < high) {
            int mid=(low+high)/2;
            if(isPossible(weights,days,mid)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    private static boolean isPossible(int[] weights, int days, int capacity) {
        int dayCount=1,currentLoad=0;
        for(int w:weights){
            if(currentLoad+w>capacity){
                dayCount++;
                currentLoad=0;
            }
            currentLoad+=w;
        }
        return dayCount<=days;
    }
}
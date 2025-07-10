

class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] matrix, int target) {
        // code here
         for(int i=0;i<matrix.length;i++){
            if(searchMatrix(matrix[i],target)){
                return true;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[] matrix,int target){
        int low=0;
        int high=matrix.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(matrix[mid]==target) return true;
            else if(matrix[mid]>target)high=mid-1;
            else low = mid+1; 
        }
        return false;
    }
}

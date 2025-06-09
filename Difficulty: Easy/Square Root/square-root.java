/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    int floorSqrt(int n) {
        // Your code here
        
        int i=1;
        int j= n;
        while(j>=i){
            int mid=(i+j)/2;
            int sqr=mid*mid;
            if(sqr==n){
                return mid;
            }
            if(sqr>n){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return j;
    }
}
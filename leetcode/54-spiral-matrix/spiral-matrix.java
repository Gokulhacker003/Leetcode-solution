class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> num=new ArrayList<>();
        int left=0,top=0,right=matrix[0].length-1,bottom=matrix.length-1;
        while(left<=right&&top<=bottom){
            for(int i=left;i<=right;i++){
                num.add(matrix[top][i]);
            if(i==right){
                top++;
            }
            }
            for(int i=top;i<=bottom;i++){
                num.add(matrix[i][right]);
                if(i==bottom){
                    right--;
                }
            }
            if(left>right||top>bottom) break;

            for(int i=right;i>=left;i--){
                num.add(matrix[bottom][i]);
                if(i==left){
                    bottom--;
                }
            }
            for(int i=bottom;i>=top;i--){
                num.add(matrix[i][left]);
                if(i==top){
                    left++;
                }
            }
        }
        return num;
    }
}
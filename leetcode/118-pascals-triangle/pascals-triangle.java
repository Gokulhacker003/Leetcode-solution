class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> temp=new ArrayList<>();
            temp.add(0,1);
            for(int j=1;j<=i;j++){
                if(j==i){
                    temp.add(1);
                }
                else {
                    List<Integer> prev = triangle.get(i - 1);
                    temp.add(j, prev.get(j) + prev.get(j - 1));
                }
            }
            triangle.add(temp);
        }
        return triangle;
    }
}
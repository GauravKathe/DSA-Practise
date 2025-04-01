class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res =new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> r= new ArrayList<>();
            int n=1;
            for(int j=0;j<=i;j++){
                r.add(n);
                n=n*(i-j)/(j+1);//to calculate value for pascal
            }
            res.add(r);
        }
        return res;
    }
}
class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int copy[][]=new int[r][c];
        //copy of matrix
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                copy[i][j]=matrix[i][j];
            }
        }
        //traversing original matrix and marking 0's on copy
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<c;k++) copy[i][k]=0;
                    for(int k=0;k<r;k++) copy[k][j]=0;
                }
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=copy[i][j];
            }
        }
    }
}
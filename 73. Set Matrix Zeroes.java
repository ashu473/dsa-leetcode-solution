class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;  // no of rows in matrix
        int col=matrix[0].length;  // no. of column in matrix

        // first we will find the index of 0's
        Set<Integer> set1=new HashSet<>();  // to store row index of 0's
        Set<Integer> set2=new HashSet<>();  // to store col index of 0's
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    set1.add(i);     // add row index in set1
                    set2.add(j);     // add col index in set2
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(set1.contains(i) || set2.contains(j)){   // if index is present in set1 or set2 make that element as 0 
                    matrix[i][j]=0;
                }
            }
        }
    }
}
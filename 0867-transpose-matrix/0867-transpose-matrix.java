class Solution {
    public int[][] transpose(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int numRowT = numCols;
        int numColT = numRows;

        int trans[][] = new int[numRowT][numColT];
        for(int i = 0 ; i<numRowT; i++) {
            for(int j = 0 ; j<numColT; j++) {
            trans[i][j] = matrix[j][i];
        } 
    }
    return trans;
}
}
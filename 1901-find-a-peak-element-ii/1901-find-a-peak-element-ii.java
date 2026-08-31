class Solution {
    public int[] findPeakGrid(int[][] mat) {

        int arr[] = new int[2];
        
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                
               int curr = mat[i][j];

               if (curr > get(mat, i - 1, j) && curr > get(mat, i + 1, j) && curr > get(mat, i, j - 1) && curr > get(mat, i, j + 1)) {
                    arr[0] = i;
                    arr[1] = j;

                    return arr;
                }
            }
        }

        return arr;
    }

    private int get(int mat[][], int i, int j){
            if(i < 0 || i >= mat.length || j < 0 || j >= mat[0].length)
            return -1;

            return mat[i][j];
        }
}
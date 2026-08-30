class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int ans[] = new int [mat.length * mat[0].length];
        int i = 0;
        int j = 0;
        int k = 0;
        int turn = 0;
        while(i < mat.length && j < mat[0].length){
            ans[k++] = mat[i][j];
            //for upper traversal
            if(turn == 0){
                while(i - 1 >= 0 && j + 1 < mat[0].length){
                    i = i -1;
                    j = j + 1;
                    ans[k++] = mat[i][j];
                }
                if(j + 1 < mat[0].length) j = j+1;
                else if(i + 1 < mat.length) i = i + 1;
                else break;
                turn = 1;
            }

            //for lower traversal
            else if(turn == 1){
                while(i + 1 < mat.length && j - 1 >= 0){
                    i = i +1;
                    j = j - 1;
                    ans[k++] = mat[i][j];
                }
                if(i + 1 < mat.length) i = i+1;
                else if(j + 1 < mat[0].length) j = j + 1;
                else break;
                turn = 0;
            }
        }
        return ans; 
    }
}
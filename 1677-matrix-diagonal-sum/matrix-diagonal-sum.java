class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int [][] visited = new int[mat.length][mat[0].length];
        for(int [] res : visited) Arrays.fill(res,0);
        int i = 0;
        int j = 0;
        while(i < mat.length && j < mat[0].length){
            visited[i][j] = 1;
            sum += mat[i++][j++];
        }
        i = 0;
        j = mat[0].length - 1;
        while(i < mat.length && j >= 0){
            if(visited[i][j] == 0) sum += mat[i][j];
            i++;
            j--;
        }
        return sum;
    }
}
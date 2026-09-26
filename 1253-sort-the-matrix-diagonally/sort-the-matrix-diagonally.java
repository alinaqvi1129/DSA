class Solution {
    public int[][] diagonalSort(int[][] mat) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int si = 0;
        int sj= 0;
        while(sj < mat[0].length){
            int i = si;
            int j = sj;
            while(i < mat.length && j < mat[0].length) heap.add(mat[i++][j++]);
            i = si;
            j = sj;
            while(i < mat.length && j < mat[0].length) mat[i++][j++] = heap.poll();
            sj++;
        }
        si = 1;
        sj = 0;
        while(si < mat.length){
            int i = si;
            int j = sj;
            while(i < mat.length && j < mat[0].length) heap.add(mat[i++][j++]);
            i = si;
            j = sj;
            while(i < mat.length && j < mat[0].length) mat[i++][j++] = heap.poll();
            si++;
        }
        return mat;
    }
}
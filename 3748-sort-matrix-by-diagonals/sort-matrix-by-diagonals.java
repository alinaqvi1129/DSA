class Solution {
    public int[][] sortMatrix(int[][] mat) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int si = 0;
        int sj= 1;
        while(sj < mat[0].length){
            int i = si;
            int j = sj;
            while(i < mat.length && j < mat[0].length) heap.add(mat[i++][j++]);
            i = si;
            j = sj;
            while(i < mat.length && j < mat[0].length) mat[i++][j++] = heap.poll();
            sj++;
        }
        si = 0;
        sj = 0;
        while(si < mat.length){
            int i = si;
            int j = sj;
            while(i < mat.length && j < mat[0].length) pq.add(mat[i++][j++]);
            i = si;
            j = sj;
            while(i < mat.length && j < mat[0].length) mat[i++][j++] = pq.poll();
            si++;
        }
        return mat;
    }
}
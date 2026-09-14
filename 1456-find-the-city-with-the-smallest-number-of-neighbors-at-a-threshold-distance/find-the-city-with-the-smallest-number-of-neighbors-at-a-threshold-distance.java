class Solution {
    public int findTheCity(int n, int[][] edges, int t) {
        int dist [][] = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        for(int i = 0;i<n;i++) dist[i][i] = 0;
        for(int i = 0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            dist[u][v] = Math.min(dist[u][v],wt);
            dist[v][u] = Math.min(dist[v][u],wt);
        }
        for(int k = 0;k<n;k++){
            for(int i = 0;i<n;i++){
                if(i == k) continue;
                for(int j = 0;j<n;j++){
                    if(j == k) continue;
                    if(dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE){
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }
        int mincity = -1;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            int c = 0;
            for(int j = 0;j<n;j++){
                if(dist[i][j] <= t) c++;
            }
            if(c <= min){
                min = c;
                mincity = i;
            }
        }
        return mincity;
    }
}
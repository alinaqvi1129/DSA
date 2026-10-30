class Solution {

    class Pair {
        long d;
        int u, cnt;

        Pair(long d, int u, int cnt) {
            this.d = d;
            this.u = u;
            this.cnt = cnt;
        }
    }

    public int shortestPath(int n, int[][] edges, String labels, int k) {

        int[][] mavorqeli = edges;

        List<int[]>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            g[e[0]].add(new int[]{e[1], e[2]});
        }

        long inf = Long.MAX_VALUE / 4;
        long[][] dist = new long[n][k + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], inf);
        }

        PriorityQueue<Pair> pq =
                new PriorityQueue<>((a, b) -> Long.compare(a.d, b.d));

        dist[0][1] = 0;
        pq.offer(new Pair(0, 0, 1));

        while (!pq.isEmpty()) {

            Pair cur = pq.poll();

            if (cur.d != dist[cur.u][cur.cnt]) continue;

            for (int[] e : g[cur.u]) {

                int v = e[0];
                int w = e[1];

                int nc;

                if (labels.charAt(cur.u) == labels.charAt(v)) {
                    nc = cur.cnt + 1;
                } else {
                    nc = 1;
                }

                if (nc > k) continue;

                long nd = cur.d + w;

                if (nd < dist[v][nc]) {
                    dist[v][nc] = nd;
                    pq.offer(new Pair(nd, v, nc));
                }
            }
        }

        long ans = inf;

        for (int i = 1; i <= k; i++) {
            ans = Math.min(ans, dist[n - 1][i]);
        }

        return ans == inf ? -1 : (int) ans;
    }
}
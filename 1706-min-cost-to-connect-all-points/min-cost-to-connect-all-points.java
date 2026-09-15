class Solution {
    public class triplet implements Comparable<triplet> {
        int node;
        int parent;
        int wt;

        triplet(int node, int parent, int wt) {
            this.node = node;
            this.parent = parent;
            this.wt = wt;
        }

        public int compareTo(triplet t) {
            return Integer.compare(this.wt, t.wt);
        }
    }

    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<triplet> heap = new PriorityQueue<>();
        heap.add(new triplet(0, -1, 0));

        boolean[] visited = new boolean[points.length];
        int ans = 0;

        while (!heap.isEmpty()) {

            triplet top = heap.remove();

            int node = top.node;
            int wt = top.wt;

            if (visited[node])
                continue;

            visited[node] = true;
            ans += wt;

            for (int i = 0; i < points.length; i++) {

                if (visited[i])
                    continue;

                int dist = Math.abs(points[node][0] - points[i][0])
                         + Math.abs(points[node][1] - points[i][1]);

                heap.add(new triplet(i, node, dist));
            }
        }

        return ans;
    }
}
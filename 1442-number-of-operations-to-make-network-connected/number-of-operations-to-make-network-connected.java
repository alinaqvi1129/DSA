class Solution {
public int makeConnected(int n, int[][] connections) {
int c = 0;
PriorityQueue<Integer> heap = new PriorityQueue<>();
List<List<Integer>> ls = new ArrayList<>();
    for (int i = 0; i < n; i++)
        ls.add(new ArrayList<>());

    for (int[] i : connections) {
        ls.get(i[0]).add(i[1]);
        ls.get(i[1]).add(i[0]);
    }

    boolean visited[] = new boolean[n];
    int cp = 0;

    for (int j = 0; j < n; j++) {
        if (!visited[j]) {
            cp++;
            heap.add(j);
            visited[j] = true;

            while (!heap.isEmpty()) {
                int poll = heap.poll();

                for (int i = 0; i < ls.get(poll).size(); i++) {
                    int next = ls.get(poll).get(i);

                    if (!visited[next]) {
                        heap.add(next);
                        visited[next] = true;
                    }
                }
            }
        }
    }

    return connections.length >= n - 1 ? cp - 1 : -1;
}
}

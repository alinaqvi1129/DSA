class Solution {
    public int countIslands(int[][] grid, int k) {
        int c = 0;
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(!visited[i][j] && grid[i][j] != 0){
                    long sum = 0;
                    Queue<int []> queue = new LinkedList<>();
                    queue.add(new int[]{i,j});
                    sum += grid[i][j];
                    visited[i][j] = true;
                    while(queue.size() > 0){
                        int[] polled = queue.poll();
                        int p = polled[0];
                        int q = polled[1];
                        if(p - 1 >= 0 && grid[p-1][q] != 0 && !visited[p-1][q]){
                            visited[p-1][q] = true;
                            sum += grid[p-1][q];
                            queue.add(new int[]{p-1,q});
                        }
                        if(q - 1 >= 0 && grid[p][q-1] != 0 && !visited[p][q-1]){
                            visited[p][q-1] = true;
                            sum += grid[p][q-1];
                            queue.add(new int[]{p,q-1});
                        }
                        if(q + 1 < grid[0].length && grid[p][q+1] != 0 && !visited[p][q+1]){
                            visited[p][q+1] = true;
                            sum += grid[p][q+1];
                            queue.add(new int[]{p,q+1});
                        }
                        if(p + 1 <grid.length && grid[p+1][q] != 0 && !visited[p+1][q]){
                            visited[p+1][q] = true;
                            sum += grid[p+1][q];
                            queue.add(new int[]{p+1,q});
                        }
                    }
                    if(sum % k == 0)c++;
                }
            }
        }
        return c;
    }
}
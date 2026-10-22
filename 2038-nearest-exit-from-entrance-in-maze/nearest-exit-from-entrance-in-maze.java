class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<int []> q = new LinkedList<>();
        q.add(new int[]{entrance[0],entrance[1],0});
        maze[entrance[0]][entrance[1]] = '+';
        while(q.size() > 0){
            int popped[] = q.poll();
            int i = popped[0];
            int j = popped[1];
            if(popped[2] > 0 && (i == 0 || j == 0 || i == maze.length - 1 || j == maze[0].length - 1)) return popped[2];
            if(i - 1 >= 0 && maze[i-1][j] == '.'){
                q.add(new int[]{i - 1,j,popped[2] + 1});
                maze[i-1][j] = '+';
            }
            if(j - 1 >= 0 && maze[i][j - 1] == '.'){
                q.add(new int[]{i,j - 1,popped[2] + 1});
                maze[i][j - 1] = '+';
            }
            if(i + 1 <= maze.length - 1 && maze[i+1][j] == '.'){
                q.add(new int[]{i + 1,j,popped[2] + 1});
                maze[i+1][j] = '+';
            }
            if(j + 1 <= maze[0].length - 1 && maze[i][j + 1] == '.'){
                q.add(new int[]{i,j + 1,popped[2] + 1});
                maze[i][j + 1] = '+';
            }
            
        }
        return -1;
    }
}
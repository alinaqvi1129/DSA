class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = graph.length - 1;
        helper(0,graph,n,ans,new ArrayList<>());
        return ans;
    }
    void helper(int i,int [][] graph,int n,List<List<Integer>> ans,List<Integer> temp){
        temp.add(i);
        if(i == n){
            ans.add(new ArrayList<>(temp));
            temp.remove(temp.size() - 1);
            return;
        }
        for(int j = 0;j<graph[i].length;j++){
            helper(graph[i][j],graph,n,ans,temp);
        }
        temp.remove(temp.size() - 1);
    }
}
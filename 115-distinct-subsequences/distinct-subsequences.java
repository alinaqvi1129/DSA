class Solution {
    public int numDistinct(String s, String t) {
        Integer dp[][] = new Integer[s.length()][t.length()];
       return helper(0,s,t,0,dp);
    }
    int helper(int i,String s, String t,int j,Integer dp[][]){
        if(j == t.length()) return 1;
        if(i > s.length() - 1) return 0;

        if(dp[i][j] != null) return dp[i][j];
        
        int c = 0;
        //dont take
        c+= helper(i + 1,s,t,j,dp);

        //take
        if(s.charAt(i) == t.charAt(j))
        c += helper(i + 1,s,t,j + 1,dp);

        return  dp[i][j] = c;
    }
}
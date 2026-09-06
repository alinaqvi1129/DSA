class Solution {
    public int numberOfUniqueGoodSubsequences(String binary) {
        // if current char is 1 dp[i] = 2* dp[i-1]
        // if current character is zero dp[i] = 2*(dp[i-1]-1);
        int endsWithOne = 0;
        int endsWithTwo = 0;
        int MOD = 1_000_000_007;
        int hasZero = 0;
        for(int i=0; i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                endsWithOne = (endsWithOne + endsWithTwo + 1)%MOD;
            }else{
                hasZero = 1;
                endsWithTwo = (endsWithOne + endsWithTwo)%MOD;
            }
        }
        int ans = (endsWithOne + endsWithTwo + hasZero)%MOD;
        
        return ans;
    }
}
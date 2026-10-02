class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        String temp = "";
        generate(0,0,n,list,temp);
        return list;
    }
    void generate(int open,int close,int n,List<String> ans,String temp){
        if(close == open && close == n){
            ans.add(temp);
            return;
        }

        if(open < n){
            generate(open +1,close,n,ans,temp + '(');
        }
        if(close < open){
            generate(open,close + 1,n,ans,temp + ')');
        }
    }
}
class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        for(int i : nums){
            if(count(i) % 2 == 0) c++;
        }
        return c;
    }
    int count(int n){
        int c = 0;
        while(n > 0){
            c++;
            n = n / 10;
        }
        return c;
    }
}
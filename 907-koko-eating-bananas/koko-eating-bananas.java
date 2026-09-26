class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = -1;
        for(int i : piles) max = Math.max(i,max);
        int low = 1;
        int high = max;
        while(low < high){
            int mid = low + (high - low)/ 2;
            if(check(piles,mid,h)){
                high = mid;
            }
            else low = mid + 1;

        }
        return low;
    }
    boolean check(int arr[] , int n,int h){
        int sum = 0;
        for(int i : arr){
            sum += (i + n - 1) / n;
        }
        if(sum <= h) return true;
        return false;

    }
}
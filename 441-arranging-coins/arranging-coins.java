class Solution {
    public int arrangeCoins(int n) {

        int i = 1;
        int j = n;

        while (i <= j) {

            int mid = i + (j - i) / 2;

            if (count(mid) > n) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return j;
    }

    long count(int n) {
        return (long) n * (n + 1) / 2;
    }
}
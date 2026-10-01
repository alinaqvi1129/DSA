class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int low = 0;

        for (int weight : weights) {
            sum += weight;
            low = Math.max(low, weight);
        }

        int high = sum;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (check(weights, mid, days)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    boolean check(int[] weights, int mid, int days) {
        int c = 1;
        int sum = 0;

        for (int weight : weights) {
            if (sum + weight > mid) {
                sum = weight;
                c++;
            } else {
                sum += weight;
            }
        }

        return c <= days;
    }
}
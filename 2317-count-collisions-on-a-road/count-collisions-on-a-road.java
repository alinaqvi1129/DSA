class Solution {
    public int countCollisions(String directions) {
        int c = 0;
        int n = directions.length();

        int left = 0, right = n - 1;
        while (left < n && directions.charAt(left) == 'L') {
            left++;
        }
        while (right >= left && directions.charAt(right) == 'R') {
            right--;
        }
        for (int i = left; i <= right; i++) {
            if (directions.charAt(i) != 'S') {
                c++;
            }
        }

        return c;
    }
}
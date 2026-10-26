class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while(i < asteroids.length){
            if(asteroids[i] < 0){
                while(st.size() > 0 && st.peek() > 0 && st.peek() < Math.abs(asteroids[i])) st.pop();
                if(st.size() > 0 && Math.abs(asteroids[i]) < st.peek()){
                    i++;
                    continue;
                }
                if(st.size() > 0 && st.peek() == Math.abs(asteroids[i])){
                    st.pop();
                    i++;
                    continue;
                }
            }
            st.push(asteroids[i++]);
        }
        while(st.size() > 0){
            ans.add(st.pop());
        }
        int[] arr = ans.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;

    }
}
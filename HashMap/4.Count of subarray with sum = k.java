import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // To handle the case when the subarray starts from index 0
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int find = sum - k;
            if (map.containsKey(find)) {
                ans += map.get(find);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}

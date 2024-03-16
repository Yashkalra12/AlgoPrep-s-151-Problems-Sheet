//Optimal Code HashMap TC:O(n)

import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans = 0;
        int sum = 0;
        int rem = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            rem = sum % k;
            if (rem < 0) {
                rem += k;
            }
            if (map.containsKey(rem)) {
                ans = ans + map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return ans;
    }
}

// BruteForce
// class Solution {
//     public int subarraysDivByK(int[] nums, int k) {
//         int n = nums.length;
//         int[] modCount = new int[k];
//         int sum = 0;
//         modCount[0] = 1; 
//         int ans = 0;

//         for (int num : nums) {
//             sum = (sum + num) % k;
//             if (sum < 0) 
//                 sum += k;
//             ans += modCount[sum];
//             modCount[sum]++;
//         }

//         return ans;
//     }
// }

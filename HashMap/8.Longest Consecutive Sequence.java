//Most optimal O(n)
import java.util.HashMap;

class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        // Count occurrences of each number
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Traverse through nums to find consecutive sequences
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (!map.containsKey(num - 1)) { // If the current number starts a sequence
                int len = 1;
                while (map.containsKey(num + 1)) {
                    len++;
                    num++;
                }
                ans = Math.max(ans, len);
            }
        }
        return ans;
    }
}

// Brute Force take O(nlogn)
// class Solution {
//     public int longestConsecutive(int[] nums) {
//         if(nums.length==0){
//             return 0;
//         }
//         Arrays.sort(nums);
//         int n=nums.length;
//         int lastsmaller=Integer.MIN_VALUE;
//         int count=0;
//         int longest=1;
//         for(int i=0;i<n;i++){
//             if(nums[i]-1 == lastsmaller){
//                 count+=1;
//                 lastsmaller=nums[i];
//             }
//             else if(lastsmaller != nums[i]){
//                 count=1;
//                 lastsmaller=nums[i];
//             }
//             longest=Math.max(longest,count);
//         }
//         return longest;

//     }
// }
//optimal
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int contains = 0;
        
        // Check if the array contains 1
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                contains++;
                break;
            }
        }
        
        // If 1 is not present, return 1
        if (contains == 0)
            return 1;
        
        // Replace negative numbers and numbers greater than n with 1
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n)
                nums[i] = 1;
        }
        
        // Mark the presence of a number by negating its value
        for (int i = 0; i < n; i++) {
            int a = Math.abs(nums[i]);
            if (a == n)
                nums[0] = -Math.abs(nums[0]);
            else
                nums[a] = -Math.abs(nums[a]);
        }
        
        // Find the first missing positive integer
        for (int i = 1; i < n; i++) {
            if (nums[i] > 0)
                return i;
        }
        
        // If all numbers from 1 to n-1 are present, the missing number is n+1
        if (nums[0] > 0)
            return n;
        
        return n + 1;
    }
}

//BruteForce
// class Solution {
//     public int firstMissingPositive(int[] nums) {
//         Arrays.sort(nums);
//         int a=1;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==a){
//                 a++;
//             }
//         }
//         return a;
// }
// }
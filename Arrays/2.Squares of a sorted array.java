class Solution{
    public int[] sortedSquares(int[] nums){
        int n=nums.length;
        int[] ans=new int[n];
        int start=0;
        int end=n-1;
        for(int i=n-1;i>=0;i--){
            if(Math.abs(nums[start]) >= Math.abs(nums[end])){
                ans[i]=nums[start]*nums[start];
                start++;
            }
            else{
                ans[i]=nums[end]*nums[end];
                end--;
            }
        }
        return ans;
    }
}
// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         for (int i = 0; i < nums.length; i++) {
//             nums[i] = nums[i] * nums[i];
//         }
//         Arrays.sort(nums);
//         return nums;
//     }
// }

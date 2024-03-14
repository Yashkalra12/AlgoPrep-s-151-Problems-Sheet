//optimal Solution
class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int n=nums.length;
        int l=0,ans=0,prev=0;

        for(int r=0;r<n;r++){
            if(nums[r]>right){
                l=r+1;
                prev=0;
            }
            else if(nums[r]<left){
                ans+=prev;
            }
            else if(nums[r]>=left && nums[r]<=right){
                ans+=r-l+1;
                prev=r-l+1;
            }
        }
        return ans;
    }
}

//BrutrForce Find all subarrays is not feasible as it gives time complexity of O(n2);
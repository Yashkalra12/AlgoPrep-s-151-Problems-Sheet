class Solution{
    public int maxSubArray(int []nums){
        int maxsofar=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<nums.length;i++){
            if(currsum<0){
                currsum=0;
            }
            currsum=currsum+nums[i];
            maxsofar=Math.max(currsum,maxsofar);
        }
        return maxsofar;
    }
}



// class Solution {
//     public int maxSubArray(int[] nums) {
//         int ans=0;
        
//         for(int i=0;i<nums.length;i++){
//             int sum=0;
//             for(int j=i;j<nums.length;j++){
                
//                  sum+=nums[j];
//                 ans=Math.max(ans,sum);
//             }
//         }
//         return ans;
//     }
// }

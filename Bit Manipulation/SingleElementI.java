//Bruteforce give TC:O(n2) SC:O(n)
// class Solution {
//     public int singleNumber(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     nums[i]=0;
//                     nums[j]=0;
//                 }
//             }
//         }
//         if(nums.length==1){
//             return nums[0];
//         }
//         int ans=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=0){
//                 ans=nums[i];
//             }
//         }
//         return ans;
//     }
// }

//Most optimal 
class Solution {
    public int singleNumber(int[] nums) {
        int ans=nums[0];
        int i=0;
        while(i<nums.length-1){
            ans=ans^nums[i+1];
            i++;
        }
        return ans;
    }
}
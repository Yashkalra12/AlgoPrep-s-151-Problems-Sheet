//Most Optimal TC: O(n) SC:O(1)
class Solution{
    public int majorityElement(int[] nums){
        int n=nums.length;
        int count=0;
        int candidate=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i] == candidate){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                candidate=nums[i];
                count=1;
            }
        }
        return candidate;
    }
}





//Optimal TC:O(n) SC:O(n)
// class Solution {
//     public int majorityElement(int[] nums){
//         int n=nums.length;
//         Map<Integer, Integer> map=new HashMap<>();

//         for(int i=0;i<n;i++){
//             map.put(nums[i], map.getOrDefault(nums[i],0)+1);
//         }
//         n=n/2;
//         for(Map.Entry<Integer, Integer> entry: map.entrySet()){
//             if(entry.getValue()>n){
//                 return entry.getKey();
//             }
//         }
//         return 0;
//     }
// }






//Brute Force. TC:O(n2) SC:O(1)
// class Solution {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//             int count = 0;
//             for (int j = 0; j < n; j++) {
//                 if (nums[i] == nums[j]) {
//                     count++;
//                 }
//             }
//             if (count > n / 2) {
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }


// 
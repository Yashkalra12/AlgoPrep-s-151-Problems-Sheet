//Most Optimal Solution with linear time complexity and constant space complexity
class Solution {
    public int singleNumber(int[] nums) {
        int seenonce=0;
        int seentwice=0;
        for(int i=0;i<nums.length;i++){
            seenonce=(seenonce ^ nums[i]) & (~seentwice);
            seentwice=(seentwice ^ nums[i]) & (~seenonce);
        }
        return seenonce;
    }
}
class Solution {
    public int[] singleNumber(int[] nums) {

        long bitmask=0;

        for(int i=0;i<nums.length;i++){
            bitmask^=nums[i];
        }

        //Getting the rightmost first bit
        long diff=bitmask &(- bitmask);

        int x=0,y=0;
        for(int num : nums){ // Fixing the variable name here
            if((num & diff)!=0){
                x^=num;
            }
            else{
                y^=num;
            }
        }
        return new int[]{(int)x, (int)y}; // Fixing the return statement here
    }
}

class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=height[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        right[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],height[i]);
        }
        int ans=0;
        for(int i=1;i<n;i++){
            ans+=(Math.min(left[i],right[i])-height[i]);
        }
        return ans;
    }
}


//BruteForce

// class Solution{
//     public int trap(int[] height){
//         int totalWater=0;

//         for(int i=0;i<height.length;i++){
//             int lmax=0,rmax=0;

//             for(int j=i;j>=0;j--){
//                 lmax=Math.max(lmax,height[j]);
//             }

//             for(int j=i;j<height.length;i++){
//                 rmax=Math.max(rmax,height[j]);
//             }

//             totalWater+=Math.min(lmax,rmax)-height[i];
//         }

//         return totalWater;
//     }
// }
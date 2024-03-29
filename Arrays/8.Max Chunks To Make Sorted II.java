//TC: O(n)
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        int[] lmax=new int[n];
        int[] rmin=new int[n];
        lmax[0]=arr[0];

        for(int i=1;i<n;i++){
            lmax[i]=Math.max(lmax[i-1],arr[i]);
        }
        rmin[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rmin[i]=Math.min(rmin[i+1],arr[i]);
        }
        int ans=0;
        for(int i=0;i<n-1;i++){
            if(lmax[i]<=rmin[i+1]){
                ans++;
            }
        }
        return ans+1;
    }
}
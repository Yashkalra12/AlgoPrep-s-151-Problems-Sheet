class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        int ans=0;
        int max=arr[0];
        for(int i=0;i<n;i++){
            max=Math.max(arr[i],max);
            if(max==i){
                ans++;
            }
        }
        return ans;
    }
}
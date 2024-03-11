class Solution{

    static void reverse(int[] arr,int i,int j){
        while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        }
    }
    public void rotate(int[] nums, int k){
        int n=nums.length;
        k=k%n;

        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);

    }
}
// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n=nums.length;
//         k=k%n;
//         int[] ans=new int[n];
//         int j=0;

//         for(int i=n-k;i<n;i++){
//             ans[j++]=nums[i];
//         }
//         for(int i=0;i<n-k;i++){
//             ans[j++]=nums[i];
    
//         }
//         for(int i=0;i<n;i++){
//         nums[i]=ans[i];
//         }
//     }
// }
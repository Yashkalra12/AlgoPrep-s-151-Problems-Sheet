//n logn
class Solution {
    public int nextGreaterElement(int n) {
        String str=Integer.toString(n);
        char[] arr=str.toCharArray();

        int i=arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }

        if(i==-1){
            return -1;
        }

        int j=arr.length-1;
        while(arr[i]>=arr[j]){
            j--;
        }

        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        Arrays.sort(arr, i+1, arr.length);

        String res=new String(arr);

        long sol=Long.parseLong(res);

        if(sol<=Integer.MAX_VALUE)
        return (int) sol;

        return -1;
    }
}
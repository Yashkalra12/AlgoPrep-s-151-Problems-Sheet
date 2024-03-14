public class Solution {
    public int checkBit(int pattern, int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if ((pattern & arr[i]) == pattern) {
                count++;
            }
        }
        return count;
    }

    public static int maxAND(int arr[], int N) {
        Solution solution = new Solution(); 
        int res = 0, count;

        for (int bit = 16; bit >= 0; bit--) {
            count = solution.checkBit(res | (1 << bit), arr, N);

            if (count >= 2) {
                res |= (1 << bit);
            }
        }
        return res;
    }
}
